package p5.js.modes

import scala.scalajs.js

@js.native
trait MonkeyPatchableP5 extends _root_.p5.js.p5 {
  var setup: js.Function0[Unit] = js.native
  var draw: js.Function0[Unit] = js.native
}
