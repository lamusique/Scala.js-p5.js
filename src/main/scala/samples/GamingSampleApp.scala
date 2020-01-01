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

  val enemyCars = new AtomicReference[List[EnemyCar]]()

  case class CarGameP5(sketch: _root_.p5.js.p5) extends PerformableP5 {
      import sketch._

      val myCar = ControllableCar(sketch)

      override def setup(): Unit = {
        createCanvas(400, 500)
        noFill()

        println("setup works.")


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


        ()
      }

      override def draw(): Unit = {

        background(200)

        myCar.move()
        myCar.render()

        myCar.sound.pitchUp()


        if (enemyCars.get.isEmpty) {
          val enemy = EnemyCar()
        }


      }

      override def keyPressed(): Unit = {

        keyCode match {

          //          case 39 =>
          //          // right arrow

          case 76 =>
            // L
            val curX = myCar.pointRef.get.x
            val nX = curX + myCar.velocity
            val nTargetP = Point(nX, myCar.targetPointRef.get.y)
            myCar.targetPointRef.set(nTargetP)

          // case 37 =>
          // left arrow

          case 74 =>
            // J
            val curX = myCar.pointRef.get.x
            val nX = curX - myCar.velocity
            val nTargetP = Point(nX, myCar.targetPointRef.get.y)
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


    case class Point(x: Int, y: Int)

    trait Car {
      val sketch: _root_.p5.js.p5
      val width: Int
      val height: Int
      val colour: Color
      val pointRef: AtomicReference[Point]

      def move(): Unit

      def render(): Unit
    }

    case class ControllableCar(
                                sketch: _root_.p5.js.p5,
                                override val width: Int = 10,
                                override val height: Int = 30,
                                //                              override val colour: Color = Color(200, 100, 100)
//                                override val colour: Color = sketch.color(1,1,1),
                                override val pointRef: AtomicReference[Point] = new AtomicReference(Point(200, 400)),
                                targetPointRef: AtomicReference[Point] = new AtomicReference(Point(200, 400))
                              ) extends Car {

      override val colour = sketch.color(200, 100, 100)

      val sound = CarSound(90)
      sound.start()


      import sketch._

      //    val width = 10
      //    val height = 30
      val velocity = 30
      val lerpAmt = 0.1

      //    val pointRef = new AtomicReference(Point(200, 400))
      //    val targetPointRef = new AtomicReference(Point(200, 400))

      def move() = {
        val lerpedX = lerp(pointRef.get.x, targetPointRef.get.x, lerpAmt)
        val nP = Point(lerpedX.toInt, pointRef.get.y)
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

  }

  case class EnemyCar(){

  }

}
