package samples

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExportTopLevel, _}

// This import decides which mode.
import p5.js.modes.global.p5

@JSExportTopLevel("GlobalModeSampleApp")
@JSExportAll
object GlobalModeSampleApp {

  def main(args: js.Array[String]): Unit = {
    println("Hello world p5.js!")

    val p5InGlobalScope = p5()

    val setupFn = () => {
      import p5InGlobalScope._
      createCanvas(400, 400)
      background(0)
      noStroke()

      val c = color(250, 100, 90)
      println(c)
      println(c.getRed())
      ()
    }

    val drawFn: () => Unit = () => {
      import p5InGlobalScope._
      if (mouseIsPressed) {
        println(mouseX)
        println(mouseY)
        ellipse(mouseX, mouseY, 20, 20)
      }
    }


    p5InGlobalScope.setup = setupFn
    p5InGlobalScope.draw = drawFn



    // Here this doesn't work owing to out of scope.
    // val c = window.color(250, 100, 90)


    val pijs = 31415926535897932d
    println(pijs)
    println(pijs + 1)
    println(pijs + 2)

    val long = 9223372036854775807L
    println(long)
    println(long + 1)


    println("the main ends.")
  }
}
