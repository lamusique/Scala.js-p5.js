package p5.js.modes.instance

import org.scalajs.dom.raw.Element

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSImport}

@js.native
trait Sketch extends _root_.p5.js.p5 {
}

@js.native
//@JSImport("p5", JSImport.Default)
@JSGlobal
class p5 extends _root_.p5.js.p5 {
  //def setup(): Unit = js.native
//  override var setup: js.Function0[Unit] = js.native
//  override var setup: Unit = js.native

//  override var draw: Unit = js.native
}

object p5 {

//  type Oscillator = this.Oscillator

  def apply(sketchFn: js.Function1[_ <: _root_.p5.js.modes.instance.p5, Unit]): p5 = {
    def instantiate[C <: js.Any : js.ConstructorTag]: C =
      js.Dynamic.newInstance(js.constructorTag[C].constructor)(sketchFn).asInstanceOf[C]
    val instantiatedP5 = instantiate[_root_.p5.js.modes.instance.p5]
    instantiatedP5
  }
  def apply(sketchFn: js.Function1[_ <: _root_.p5.js.modes.instance.p5, Unit], id: String): p5 = {
    def instantiate[C <: js.Any : js.ConstructorTag]: C =
      js.Dynamic.newInstance(js.constructorTag[C].constructor)(sketchFn, id).asInstanceOf[C]
    val instantiatedP5 = instantiate[_root_.p5.js.modes.instance.p5]
    instantiatedP5
  }
  def apply(sketchFn: js.Function1[_ <: _root_.p5.js.modes.instance.p5, Unit], elm: Element): p5 = {
    def instantiate[C <: js.Any : js.ConstructorTag]: C =
      js.Dynamic.newInstance(js.constructorTag[C].constructor)(sketchFn, elm).asInstanceOf[C]
    val instantiatedP5 = instantiate[_root_.p5.js.modes.instance.p5]
    instantiatedP5
  }

//  def apply[T <: p5](sketchFn: js.Function1[T, Unit]): T = {
//    def instantiate[C <: js.Any : js.ConstructorTag]: C =
//      js.Dynamic.newInstance(js.constructorTag[C].constructor)(sketchFn).asInstanceOf[C]
//    val instantiatedP5 = instantiate[ClassTag[T]]
//    instantiatedP5
//  }


}
