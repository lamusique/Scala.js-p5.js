package samples

import java.util.concurrent.atomic.{AtomicInteger, AtomicReference}

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

        background(200)

        myCar.move()
        myCar.render()

        myCar.sound.pitchUp()


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
//        if (enemyCarsRef.get.isEmpty) {
//          val enemy = EnemyCar(sketch)
//          enemyCarsRef.set(List(enemy))
//        }

        val maxCars = appRand.getNaturalNumber(simulNumOfCars)
        if (enemyCarsRef.get.size < maxCars) {
          val shortage = maxCars - enemyCarsRef.get.size
          val nCars = (1 to shortage).map(i => EnemyCar(sketch)).toList
          val nList = enemyCarsRef.get ::: nCars
          enemyCarsRef.set(nList)
        }

        enemyCarsRef.get.foreach(enemy => {
          enemy.move()
          enemy.render()
          enemy.sound.pitchUp()
        })


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
//      val r = new java.util.Random(seed)
      val r = new java.util.Random()

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
      val width: Int
      val height: Int
      val colour: Color
      val pointRef: AtomicReference[Point]
      val velocity: Double

      def move(): Unit

      def render(): Unit
    }

    case class ControllableCar(
                                sketch: _root_.p5.js.p5,
                                override val width: Int = 10,
                                override val height: Int = 30,
                                override val pointRef: AtomicReference[Point] = new AtomicReference(Point(200, 400)),
                                override val velocity: Double = 30,
                                targetPointRef: AtomicReference[Point] = new AtomicReference(Point(200, 400))
                              ) extends Car {

      override val colour = sketch.color(200, 100, 100)

      val sound = CarSound(90)
      sound.start()


      import sketch._

      val lerpAmt = 0.1

      //    val pointRef = new AtomicReference(Point(200, 400))
      //    val targetPointRef = new AtomicReference(Point(200, 400))

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

  case class CarSound(hz: Double = 90, amp: Double = 0.5) {

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
                              override val width: Int = 10,
                              override val height: Int = 30,
                              override val pointRef: AtomicReference[Point] = new AtomicReference(Point(appRand.getNaturalNumber(appWidth), 0)),
//                              override val velocity: Double = 4,
                              override val velocity: Double = appRand.getDecimal(3, 20),
                              hue: Short = appRand.getNaturalNumber(360)
                            ) extends Car {

    val number = enemyCounter.incrementAndGet()

    override val colour = sketch.color(hue, 80, 50)
//    println(hue)

    val sound = CarSound(150 * velocity / 4.0)
    sound.start()


    import sketch._

    val lerpAmt = 0.1

    //    val pointRef = new AtomicReference(Point(200, 400))
    //    val targetPointRef = new AtomicReference(Point(200, 400))

    def move() = {
      val cur = pointRef.get
      val nP = Point(cur.x, (cur.y + velocity).toShort)
      pointRef.set(nP)
    }

    def render() = {

//      colorMode(HSL)
      fill(colour)
      val p = pointRef.get
      rect(p.x, p.y, width, height)
//      text(number, p.x, p.y)
    }

    def destroy(): Unit = {
      sound.stop()
    }

  }

}
