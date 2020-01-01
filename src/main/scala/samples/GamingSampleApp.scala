package samples

import java.util.concurrent.atomic.{AtomicBoolean, AtomicInteger, AtomicReference}

import org.scalajs.dom
import org.scalajs.dom.document
import p5.js.modes.instance.Prerequisite
import p5.js.modes.{MonkeyPatchableP5, PerformableP5}
import p5.js.modules.Oscillator
import p5.js.modules.color.p5.Color

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExportTopLevel, _}

// This import decides which mode.
import p5.js.modes.instance.p5

@JSExportTopLevel("GamingSampleApp")
@JSExportAll
object GamingSampleApp extends Prerequisite {

  override def instance(sketch: MonkeyPatchableP5): PerformableP5 = CarGameP5(sketch)

  val enemyCarsRef = new AtomicReference(List.empty[EnemyCar])
  val appRand = Random(1000)

  val appWidth = 400.toShort
  val appHeight = 500.toShort

  val simulNumOfCars = 6

  // scores
  val overtakenCars = new AtomicReference(Set.empty[Int])
  val cumulCollisions = new AtomicReference(Set.empty[Int])

  case class CarGameP5(sketch: _root_.p5.js.p5) extends PerformableP5 {
      import sketch._

      val myCar = ControllableCar(sketch)

      override def setup(): Unit = {
        createCanvas(appWidth, appHeight)
        noFill()

        println("setup works.")

        colorMode(HSL)

        // Start the audio context on a click/touch event

        val myDiv = createDiv("click to start audio")
        myDiv.style("color: white")
        myDiv.position(100, 100)

        // implicit conversion
        // https://www.scala-js.org/doc/interoperability/types.html
        val onFulfilled: js.Function1[Unit, Unit] = Unit => {
          myDiv.remove()
          ()
        }

        userStartAudio().`then`[Unit](
          onFulfilled)


        enemyCarsRef.set((1 to 10).map(i => EnemyCar(sketch)).toList)



        ()
      }

      override def draw(): Unit = {

        background(0, 4, 70)


        myCar.update()



        // update
        {
          val nList = enemyCarsRef.get.flatMap(enemy => {
            if (enemy.pointRef.get().y > appHeight) {
              enemy.destroy()
              None
            } else {
              Some(enemy)
            }
          })
          enemyCarsRef.set(nList)
        }

        val maxCars = appRand.getNaturalNumber(simulNumOfCars)
        if (enemyCarsRef.get.size < maxCars) {
          val shortage = maxCars - enemyCarsRef.get.size
          val nCars = (1 to shortage).map(i => EnemyCar(sketch)).toList
          val nList = enemyCarsRef.get ::: nCars
          enemyCarsRef.set(nList)
        }

        enemyCarsRef.get.foreach(enemy => {
          enemy.update()
        })


        // scoring

        {
          val collidedCars = enemyCarsRef.get.filter(_.isCollided(myCar))
          collidedCars.foreach(_.soundCollision())
          val collidedIDs = collidedCars.map(_.number).toSet
          val nSet = collidedIDs ++ cumulCollisions.get
          cumulCollisions.set(nSet)
        }

        val theLatestPassedID = {
          val curPassedCar = enemyCarsRef.get.filter(_.isPassed(myCar))
          val curPassedIDs = curPassedCar.map(_.number).toSet
          val nSet = curPassedIDs ++ overtakenCars.get
          overtakenCars.set(nSet)
          val theLatestPassedID = overtakenCars.get.max
          theLatestPassedID
        }

        fill(color(0, 0, 0))
        text("Passed Cars: " + theLatestPassedID, appWidth - 100, 10)
        val collisions = cumulCollisions.get.size
        text("Collisions: " + collisions, appWidth - 100, 20)
        text("Score: " + (theLatestPassedID / (collisions + 1)).floor, appWidth - 100, 30)
      }

      override def keyPressed(): Unit = {

        keyCode match {

          //          case 39 =>
          //          // right arrow

          case 76 =>
            // L
            val curX = myCar.pointRef.get.x
            val nX = curX + myCar.velocity
            val nTargetP = Point(nX.toShort, myCar.targetPointRef.get.y)
            myCar.targetPointRef.set(nTargetP)

          // case 37 =>
          // left arrow

          case 74 =>
            // J
            val curX = myCar.pointRef.get.x
            val nX = curX - myCar.velocity
            val nTargetP = Point(nX.toShort, myCar.targetPointRef.get.y)
            myCar.targetPointRef.set(nTargetP)

          // up arrow
          // case 38 =>

          case 73 =>
            // I
            println("up")


          // case 40 =>
          // down arrow

          case 75 =>
            // K
            println("down")

          case _ =>
        }

        ()

      }
    }


  // pointless to use Short on JavaScript but this is an experiment
    case class Point(x: Short, y: Short)

    case class Random(seed: Long) {
      // a fixed start
      val r = new java.util.Random(seed)
//      val r = new java.util.Random()

      def getNaturalNumber(limit: Int) =
        r.nextInt(limit).toShort

      def getDecimal(lowLimit: Double, highLimit: Double) = {
        val d = r.nextDouble()
        val range = highLimit - lowLimit
        d * range + lowLimit
      }

    }

    trait Car {
      val sketch: _root_.p5.js.p5
      val width: Short
      val height: Short
      val colour: Color
      val pointRef: AtomicReference[Point]
      val velocity: Double
      val carSound: CarSound
      val collisionSoundRef: AtomicReference[Option[CollisionSound]]

      def update(): Unit = {
        move()
        carSound.pitchUp()
        renderSoundCollision()
        render()
      }

      def move(): Unit

      def render(): Unit

      def isCollided(counterCar: Car): Boolean = {

        val curP = pointRef.get
        val counterP = counterCar.pointRef.get()

        // vertical area

//        Option.when(curP.y < counterP.y)()
//        (curP.y + this.height) > counterP.y


        // horizontal area

//        Option.when(curP.x < counterP.x)()
//        (curP.x + this.width) > counterP.x


        val checks = List(
          () => {curP.y < counterP.y + counterCar.height},
          () => {(curP.y + this.height) > counterP.y},
          () => {curP.x < counterP.x + counterCar.width},
          () => {(curP.x + this.width) > counterP.x }
        )

        val res = checks.forall(_.apply())
        res
      }

      def soundCollision() = {
        val sound = collisionSoundRef.get match {
          case None =>
            val sound = CollisionSound()
            sound.start
            sound
          case Some(sound) => sound
        }
        collisionSoundRef.set(Some(sound))
      }
      def renderSoundCollision() = {
        collisionSoundRef.get.flatMap(sound => {
          if (sound.shouldDie) {
            sound.stop
            None
          } else
            sound.pitchDown
            Some(sound)
        })
      }

      def isPassed(counterCar: Car) =
        this.pointRef.get.y + this.height < counterCar.pointRef.get.y

    }

    case class ControllableCar(
                                sketch: _root_.p5.js.p5,
                                override val width: Short = 10,
                                override val height: Short = 30,
                                override val pointRef: AtomicReference[Point] = new AtomicReference(Point(200, 400)),
                                override val velocity: Double = 30,
                                override val collisionSoundRef: AtomicReference[Option[CollisionSound]] = new AtomicReference(None),
                                targetPointRef: AtomicReference[Point] = new AtomicReference(Point(200, 400))
                              ) extends Car {

      override val colour = sketch.color(200, 100, 100)

      override val carSound = CarSound(90)
      carSound.start()


      import sketch._

      val lerpAmt = 0.1


      def move() = {
        val lerpedX = lerp(pointRef.get.x, targetPointRef.get.x, lerpAmt)
        val nP = Point(lerpedX.toShort, pointRef.get.y)
        pointRef.set(nP)
      }

      def render() = {
//        fill(200, 100, 100)
        fill(colour)
        val p = pointRef.get
        rect(p.x, p.y, width, height)
      }
    }

  case class CollisionSound() {

    val freq = new AtomicReference(440.0)
    val counter = new AtomicInteger(0)
    val maxNumOfChanges = 50
    val lowLimitHz = 10

    val osc = new _root_.p5.js.modules.Pulse()
    osc.amp(0.8)
    osc.freq(2200)
    osc.width(0.6)

    val downRate = 0.7

    def pitchDown = {
      val calcedHz = freq.get() * downRate
      val nHz = if (calcedHz < lowLimitHz) lowLimitHz else calcedHz
      osc.freq(nHz)
      freq.set(nHz)
      counter.incrementAndGet()
    }

    def shouldDie = counter.get > maxNumOfChanges

    def start = osc.start()
    def stop = osc.stop()

  }

  case class CarSound(hz: Double = 90, amp: Double = 0.1) {

    val diffRate = 1.1
    val limitHz = 600.0
    val curHz = new AtomicReference[Double](hz)

    val osc1 = Oscillator("sawtooth")
    osc1.amp(amp)
    osc1.freq(hz)
//    osc1.start()

    val osc2 = Oscillator("sawtooth")
    osc2.amp(amp)
    osc2.freq(hz * diffRate)
//    osc2.start()

    def pitch(hz: Double) = {
      osc1.freq(hz)
      osc2.freq(hz * diffRate)
    }
    def pitchUp(rate: Double = 1.001) = {
      val nHz = curHz.get() * rate
      val limitedHz = if (nHz > limitHz) limitHz else nHz
      curHz.set(limitedHz)
      osc1.freq(limitedHz)
      osc2.freq(limitedHz * diffRate)
    }

    def start() = {
      osc1.start()
      osc2.start()
    }
    def stop() = {
      osc1.stop(0)
      osc1.disconnect()
      osc2.stop(0)
      osc2.disconnect()
    }
  }

  val enemyCounter = new AtomicInteger()
  case class EnemyCar(
                              sketch: _root_.p5.js.p5,
                              override val width: Short = 10,
                              override val height: Short = 30,
                              override val pointRef: AtomicReference[Point] = new AtomicReference(Point(appRand.getNaturalNumber(appWidth), 0)),
//                              override val velocity: Double = 4,
                              override val velocity: Double = appRand.getDecimal(3, 20),
                              override val collisionSoundRef: AtomicReference[Option[CollisionSound]] = new AtomicReference(None),
                              hue: Short = appRand.getNaturalNumber(360)
                            ) extends Car {

    val number = enemyCounter.incrementAndGet()

    override val colour = sketch.color(hue, 80, 50)
//    println(hue)

    override val carSound = CarSound(150 * velocity / 4.0, amp = 0.04)
    carSound.start()


    import sketch._

    val lerpAmt = 0.1


    def move() = {
      val cur = pointRef.get
      val nP = Point(cur.x, (cur.y + velocity).toShort)
      pointRef.set(nP)
    }

    def render() = {

      fill(colour)
      val p = pointRef.get
      rect(p.x, p.y, width, height)
      text(number, p.x, p.y)
    }

    def destroy(): Unit = {
      carSound.stop()
      collisionSoundRef.get().foreach(_.stop)
    }

  }

}
