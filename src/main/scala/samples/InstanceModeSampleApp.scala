package samples

import p5.js.modules._
import p5.js.p5

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExportTopLevel, _}
import scala.scalajs.js.|

@JSExportTopLevel("InstanceModeSampleApp")
@JSExportAll
object InstanceModeSampleApp {

  def main(args: js.Array[String]): Unit = {
    println("Hello world p5.js!")


    val sketchFn: js.Function1[_root_.p5.js.modes.instance.p5, Unit] = (sketch: _root_.p5.js.modes.instance.p5) => {

      import sketch._
      setup = () => {
        createCanvas(400, 400)
        background(0)
        noStroke()

        val c = color(250, 100, 90)
        println(c)
        println(c.getRed())
        ()
      }

      draw = () => {
        if (mouseIsPressed) {
          println(mouseX)
          println(mouseY)
          ellipse(mouseX, mouseY, 20, 20)
        }
      }

    }


    val p5Instance = _root_.p5.js.modes.instance.p5.apply(sketchFn)




    println("the main ends.")
  }
}
