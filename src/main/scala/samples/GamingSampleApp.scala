package samples

import java.util.concurrent.atomic.{AtomicInteger, AtomicReference}

import org.scalajs.dom
import org.scalajs.dom.document
import p5.js.modes.{MonkeyPatchableP5, PerformableP5}
import p5.js.modules.{Color, FFT, Oscillator}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExportTopLevel, _}

// This import decides which mode.
import p5.js.modes.instance.p5

@JSExportTopLevel("GamingSampleApp")
@JSExportAll
object GamingSampleApp {

  def main(args: js.Array[String]): Unit = {
    println("the main starts.")


    val sketchFn: js.Function1[_ <: _root_.p5.js.p5, Unit] = (sketch: MonkeyPatchableP5) => {

      val ins = new MyP5(sketch)

      import sketch._
      //      setup =
      //      val myCar = ControllableCar(sketch)
      //        p5.setup =
      sketch.setup = ins.setupFn
      sketch.draw = ins.drawFn
      sketch.keyPressed = ins.keyPressedFn

    }

      // instantiate
      //    val myp5: MyP5 = p5(sketchFn)
      //    val myp5 = js.Dynamic.newInstance(root_.p5.js.modes.instance.p5)(sketchFn).asInstanceOf[MyP5]
      //    val myp5 = new MyP5(sketchFn)
      val myp5 = p5(sketchFn)

      println("the main ends.")
    }





//    @js.native
    //@JSImport("p5", JSImport.Default)
    //@JSGlobal("p5")
    //class MyP5(sketchFn: js.Function1[MyP5, Unit]) extends p5 {
//    implicit class MyP5(sketch: p5) extends p5 {
    case class MyP5(sketch: _root_.p5.js.p5) extends PerformableP5 {
      //    => sketch: this
      import sketch._

      //    val myCar: ControllableCar
      val myCar = ControllableCar(sketch)

      def test() = println("test")


      override def setup(): Unit = {
        createCanvas(400, 500)
        noFill()

        println("setup works.")

        ()
      }

      override def draw(): Unit = {

        background(200)

        myCar.move()
        myCar.render()

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
                                override val colour: Color = null,
                                override val pointRef: AtomicReference[Point] = new AtomicReference(Point(200, 400)),
                                targetPointRef: AtomicReference[Point] = new AtomicReference(Point(200, 400))
                              ) extends Car {

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
        fill(200, 100, 100)
        val p = pointRef.get
        rect(p.x, p.y, width, height)
      }
    }


}
