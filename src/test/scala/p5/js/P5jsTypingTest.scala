package p5.js

import p5.js.modes.global.p5

import scala.scalajs.js

object P5jsTypingTest {

  val p5InGlobalScope = p5()
  import p5InGlobalScope._

  print(js.Array("", ""))



}
