package p5.js.modes.global

import scala.scalajs.js

@js.native
trait p5 extends _root_.p5.js.p5 {
}
object p5 {
  def apply(): p5 = js.Dynamic.global.window.asInstanceOf[p5]
  def apply(setup: js.Function0[Unit], draw: js.Function0[Unit]): p5 = {
    val globalScope = js.Dynamic.global.window.asInstanceOf[p5]
    globalScope.setup = setup
    globalScope.draw = draw
    globalScope
  }
}
