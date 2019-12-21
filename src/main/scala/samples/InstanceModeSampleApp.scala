package samples

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExportTopLevel, _}

// This import decides which mode.
import p5.js.modes.instance.p5

@JSExportTopLevel("InstanceModeSampleApp")
@JSExportAll
object InstanceModeSampleApp {

  def main(args: js.Array[String]): Unit = {
    println("Hello world p5.js!")

    // https://github.com/processing/p5.js/wiki/Global-and-instance-mode

    val sketchFn: js.Function1[p5, Unit] = (sketch: p5) => {

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

    // instantiate
    val myp5 = p5(sketchFn)


    println("the main ends.")
  }
}
