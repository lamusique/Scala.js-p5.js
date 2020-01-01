package p5.js.modules.color

import scala.scalajs.js
import _root_.p5.js.p5
import _root_.p5.js.modules.color.p5.Color

@js.native
trait Setting extends js.Object {

  def colorMode(mode: String, max: js.UndefOr[Short]): p5 = js.native
  def colorMode(mode: String, max1: Short, max2: Short, max3: Short, maxA: js.UndefOr[Short] = js.undefined): p5 = js.native

  def fill(value: String): p5 = js.native
  def fill(gray: Short, alpha: js.UndefOr[Short] = js.undefined): p5 = js.native
  def fill(values: js.Array[Short]): p5 = js.native
  def fill(color: Color): p5 = js.native

}
