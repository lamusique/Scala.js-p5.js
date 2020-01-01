package p5.js.modules.color.p5

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSName}


//@js.native
//trait Color {
//}

// p5.js/src/color/p5.Color.js
@js.native
@JSGlobal("p5.Color")
class Color extends js.Object {

  // These are internal fuctions of p5.js but useful for Scala
  @JSName("_getRed")
  def getRed(): Short = js.native

}
//object Color {
//  def apply(psInt, args) =
//}

