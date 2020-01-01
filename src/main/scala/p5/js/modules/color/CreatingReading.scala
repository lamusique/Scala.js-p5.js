package p5.js.modules.color


import scala.scalajs.js
import _root_.p5.js.modules.color.p5.Color


// p5.js/src/color/creating_reading.js

@js.native
trait CreatingReading extends js.Object {


  // grey
//  def color(gray: Short, alpha: js.UndefOr[Short] = js.undefined): Color = js.native
  // evade an error:
  // in trait p5, multiple overloaded alternatives of method color define default arguments.
  def color(gray: Short): Color = js.native
  def color(gray: Short, alpha: Short): Color = js.native

//  def color(v1: Short, v2: Short, v3: Short, alpha: js.UndefOr[Short] = js.undefined): Color = js.native
  def color(v1: Short, v2: Short, v3: Short): Color = js.native
  def color(v1: Short, v2: Short, v3: Short, alpha: Short): Color = js.native

//  def color(value: String, alpha: js.UndefOr[Short] = js.undefined): Color = js.native
  def color(value: String): Color = js.native
  def color(value: String, alpha: Short): Color = js.native

  def color(values: js.Array[String]): Color = js.native
  def color(color: Color): Color = js.native


}
