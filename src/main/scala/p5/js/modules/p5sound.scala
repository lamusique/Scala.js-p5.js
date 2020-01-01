package p5.js.modules

import org.scalajs.dom.raw.AudioParam
import p5.js.modules.core.p5.Element

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSName}
import scala.scalajs.js.|

@js.native
trait Sound extends js.Object {
  def userStartAudio(elements: js.UndefOr[Element | js.Array[Element]] = js.undefined, callback: js.UndefOr[js.ThisFunction] = js.undefined): js.Promise[Unit] = js.native

}
//@js.native
//@JSGlobal("p5.Sound")
//class Sound extends js.Object {
//
//  def userStartAudio(elements: js.UndefOr[Element | js.Array[Element]] = js.undefined, callback: js.UndefOr[js.ThisFunction] = js.undefined): js.Promise[Unit] = js.native
//
//}

@js.native
@JSGlobal("p5.Oscillator")
class Oscillator() extends js.Object {

  def start(time: Double = 1.0, frequency: Double = 0.0): Unit = js.native

  def stop(secondsFromNow: Double): Unit = js.native

  def amp(vol: Double, rampTime: js.UndefOr[Double] = js.undefined, timeFromNow: js.UndefOr[Double] = js.undefined): AudioParam = js.native
  // https://p5js.org/reference/#/p5.Oscillator/freq
  def freq(frequency: Double | Signal | Oscillator, rampTime: js.UndefOr[Double] = js.undefined, timeFromNow: js.UndefOr[Double] = js.undefined): AudioParam = js.native

  def setType(`type`: String): Unit = js.native

  def connect(unit: js.Any): Unit = js.native

  def disconnect(): Unit = js.native

  def pan(panning: Double, timeFromNow: Double): Unit = js.native

  def phase(phase: Double): Unit = js.native

  def add(number: Double): Oscillator = js.native

  def mult(number: Double): Oscillator = js.native

  def scale(inMin: Double, inMax: Double, outMin: Double, outMax: Double): Oscillator = js.native
}
object Oscillator {
  def apply(): Oscillator = {
    def instantiate[C <: js.Any : js.ConstructorTag]: C =
      js.Dynamic.newInstance(js.constructorTag[C].constructor)().asInstanceOf[C]
    val instance = instantiate[Oscillator]
    instance
  }
  def apply(`type`: String): Oscillator = {
    def instantiate[C <: js.Any : js.ConstructorTag]: C =
      js.Dynamic.newInstance(js.constructorTag[C].constructor)(`type`).asInstanceOf[C]
    val instance = instantiate[Oscillator]
    instance
  }
  def apply(freq: Double): Oscillator = {
    def instantiate[C <: js.Any : js.ConstructorTag]: C =
      js.Dynamic.newInstance(js.constructorTag[C].constructor)(freq).asInstanceOf[C]
    val instance = instantiate[Oscillator]
    instance
  }
  def apply(freq: Double, `type`: String): Oscillator = {
    def instantiate[C <: js.Any : js.ConstructorTag]: C =
      js.Dynamic.newInstance(js.constructorTag[C].constructor)(freq, `type`).asInstanceOf[C]
    val instance = instantiate[Oscillator]
    instance
  }
}

@js.native
@JSGlobal("p5.FFT")
class FFT protected () extends js.Object {
  def this(smoothing: Double = 1.0, bins: Double = 1.0) = this()
  def setInput(source: js.Any = ""): Unit = js.native
  def waveform(bins: Double = 1.0, precision: String = ""): js.Array[Double] = js.native
  def analyze(bins: Double = 1.0, scale: Double = 1.0): js.Array[js.Any] = js.native
  def getEnergy(frequency1: Double | String, frequency2: Double = 1.0): Double = js.native
  def getCentroid(): Double = js.native
  def smooth(smoothing: Double): Unit = js.native
}
object FFT {
  def apply(): FFT = {
    def instantiate[C <: js.Any : js.ConstructorTag]: C =
      js.Dynamic.newInstance(js.constructorTag[C].constructor)().asInstanceOf[C]
    val instance = instantiate[FFT]
    instance
  }
}
