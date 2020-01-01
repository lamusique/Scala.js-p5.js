package p5.js.modules.dom

import org.scalajs.dom.raw.HTMLElement
import p5.js.modules.color.p5.Color
import p5.js.modules.core.p5.Element
import p5.js.p5
import _root_.p5.js.modules.ancillary.ComplementaryModule.Point

import scala.scalajs.js
import scala.scalajs.js.|

// p5.js/src/dom/dom.js
// https://github.com/processing/p5.js/blob/master/src/dom/dom.js

@js.native
trait DomForP5 extends js.Object {

  def select(name: String, container: String | Element | HTMLElement): Element = js.native

}

@js.native
trait DomForElement extends js.Object {


  def style(property: String): String = js.native
  def style(property: String, value: String | Double | Color): p5 = js.native

  def position(): Point = js.native
  def position(x: Int, y: Int): p5 = js.native

  def remove(): Nothing = js.native

}

