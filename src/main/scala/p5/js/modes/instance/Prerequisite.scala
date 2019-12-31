package p5.js.modes.instance

import scala.scalajs.js
import _root_.p5.js.modes.PerformableP5
import _root_.p5.js.modes.MonkeyPatchableP5

trait Prerequisite {

  def instance(sketch: MonkeyPatchableP5): PerformableP5

//  def run(): Unit = {
def main(args: Array[String]): Unit = {
    println("The main starts.")

    val sketchFn: js.Function1[_ <: _root_.p5.js.p5, Unit] = (sketch: MonkeyPatchableP5) => {
      val ins = instance(sketch)
      sketch.setup = ins.setupFn
      sketch.draw = ins.drawFn
      sketch.keyPressed = ins.keyPressedFn
    }

    // instantiate for instance mode.
    val myp5 = p5(sketchFn)

    println("the main ends.")
  }

}
