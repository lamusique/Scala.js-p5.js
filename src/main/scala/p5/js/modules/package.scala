package p5.js.modules

//object Modules {
//
//}

//package p5.js.lib

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSGlobalScope, JSName}
import scala.scalajs.js.|


@js.native
@JSGlobal("p5.Color")
class Color extends js.Object {
//@JSName("p5.Color")
//trait Color extends js.Object {
  @JSName("_getRed")
  def getRed(): Short = js.native
}

// https://github.com/processing/p5.js/blob/master/src/dom/dom.js
@js.native
@JSGlobal("p5.Element")
class Element protected () extends js.Object {
  def this(elt: String, pInst: js.Any = "") = this()
  var elt: js.Any = js.native
  def parent(parent: String | js.Any): Element = js.native
  def id(id: String): Element = js.native
  def mousePressed(fxn: js.Function0[Any]): Element = js.native
  def mouseWheel(fxn: js.Function0[Any]): Element = js.native
  def mouseReleased(fxn: js.Function0[Any]): Element = js.native
  def mouseClicked(fxn: js.Function0[Any]): Element = js.native
  def mouseMoved(fxn: js.Function0[Any]): Element = js.native
  def mouseOver(fxn: js.Function0[Any]): Element = js.native
  def changed(fxn: js.Function0[Any]): Element = js.native
  def input(fxn: js.Function0[Any]): Element = js.native
  def mouseOut(fxn: js.Function0[Any]): Element = js.native
  def touchStarted(fxn: js.Function0[Any]): Element = js.native
  def touchMoved(fxn: js.Function0[Any]): Element = js.native
  def touchEnded(fxn: js.Function0[Any]): Element = js.native
  def dragOver(fxn: js.Function0[Any]): Element = js.native
  def dragLeave(fxn: js.Function0[Any]): Element = js.native
  def child(child: String | js.Any | Element = ???): Element = js.native
  // https://p5js.org/reference/#/p5.Element/position
  // https://www.scala-js.org/doc/interoperability/types.html
  def position(x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): js.Dynamic = js.native
  def style(property: String, value: js.UndefOr[String | Double | Color] = js.undefined): String = js.native
  def remove(): Unit = js.native
}

@js.native
@JSGlobal("p5.Graphics")
class Graphics extends Element {
}

@js.native
@JSGlobal("p5.Renderer")
class Renderer extends Element {
}

@js.native
@JSGlobal("p5.Image")
class Image extends js.Object {
  def this(width: Double, height: Double, pInst: js.Any) = this()
  var width: js.Any = js.native
  var height: js.Any = js.native
  def loadPixels(): Unit = js.native
  def set(x: Double, y: Double, a: Double | js.Array[js.Any] | js.Any): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def mask(srcImage: Image): Unit = js.native
  def save(filename: String, extension: String): Unit = js.native
}

@js.native
@JSGlobal("p5.Table")
class Table protected () extends js.Object {
  def this(rows: js.Array[js.Any] = ???) = this()
  var columns: js.Any = js.native
  var rows: js.Any = js.native
  def addRow(row: TableRow = new TableRow): Unit = js.native
  def removeRow(id: Double): Unit = js.native
  def getRows(): js.Array[js.Any] = js.native
  def findRows(value: String, column: Double | String): js.Array[js.Any] = js.native
  def matchRows(regexp: String, column: String | Double = 1.0): js.Array[js.Any] = js.native
  def getColumn(column: String | Double): js.Array[js.Any] = js.native
  def clearRows(): Unit = js.native
  def addColumn(title: String = ""): Unit = js.native
  def getRowCount(): Double = js.native
  def removeTokens(chars: String, column: String | Double = 1.0): Unit = js.native
  def trim(column: String | Double): Unit = js.native
  def removeColumn(column: String | Double): Unit = js.native
  def set(column: String | Double, value: String | Double): Unit = js.native
  def setNum(row: Double, column: String | Double, value: Double): Unit = js.native
  def setString(row: Double, column: String | Double, value: String): Unit = js.native
  def get(row: Double, column: String | Double): String | Double = js.native
  def getNum(row: Double, column: String | Double): Double = js.native
  def getString(row: Double, column: String | Double): String = js.native
  def getObject(headerColumn: String): js.Dynamic = js.native
  def getArray(): js.Array[js.Any] = js.native
}

@js.native
@JSGlobal("p5.TableRow")
class TableRow protected () extends js.Object {
  def this(str: String = "", separator: String = "") = this()
  def set(column: String | Double, value: String | Double): Unit = js.native
  def setNum(column: String | Double, value: Double): Unit = js.native
  def setString(column: String | Double, value: String): Unit = js.native
  def get(column: String | Double): String | Double = js.native
  def getNum(column: String | Double): Double = js.native
  def getString(column: String | Double): String = js.native
}

@js.native
@JSGlobal("p5.Vector")
class Vector protected () extends js.Object {
  def this(x: Double = 0.0, y: Double = 0.0, z: Double = 0.0) = this()
  var x: js.Any = js.native
  var y: js.Any = js.native
  var z: js.Any = js.native
  // def toString(): String = js.native
  def set(x: Double | Vector | js.Array[js.Any] = ???, y: Double = 0.0, z: Double = 0.0): Unit = js.native
  def copy(): Vector = js.native
  def add(x: Double | Vector | js.Array[js.Any], y: Double = 0.0, z: Double = 0.0): Vector = js.native
  def sub(x: Double | Vector | js.Array[js.Any], y: Double = 0.0, z: Double = 0.0): Vector = js.native
  def mult(n: Double): Vector = js.native
  def div(n: Double): Vector = js.native
  def mag(): Double = js.native
  def magSq(): Double = js.native
  def dot(x: Double | Vector, y: Double = 0.0, z: Double = 0.0): Double = js.native
  def cross(v: Vector): Vector = js.native
  def dist(v: Vector): Double = js.native
  def normalize(): Vector = js.native
  def limit(max: Double): Vector = js.native
  def setMag(len: Double): Vector = js.native
  def heading(): Double = js.native
  def rotate(angle: Double): Vector = js.native
  def array(): js.Array[js.Any] = js.native
  def equals(x: Double | Vector | js.Array[js.Any] = ???, y: Double = 0.0, z: Double = 0.0): Boolean = js.native
}

@js.native
@JSGlobal("p5.Vector")
object Vector extends js.Object {
  def fromAngle(angle: Double): Vector = js.native
  def random2D(): Vector = js.native
  def random3D(): Vector = js.native
  def angleBetween(v1: Vector, v2: Vector): Double = js.native
}

@js.native
@JSGlobal("p5.Font")
class Font protected () extends js.Object {
  def this(pInst: js.Any = "") = this()
  var font: js.Any = js.native
  def textBounds(line: String, x: Double, y: Double, fontSize: Double, options: js.Any): js.Dynamic = js.native
}

@js.native
@JSGlobal("p5.MediaElement")
class MediaElement protected () extends js.Object {
  def this(elt: String, pInst: js.Any = "") = this()
  var src: js.Any = js.native
  def volume(`val`: Double = 1.0): Double | MediaElement = js.native
  def duration(): Double = js.native
  def disconnect(): Unit = js.native
  def showControls(): Unit = js.native
  def hideControls(): Unit = js.native
  def addCue(time: Double, callback: js.Function0[Any], value: js.Any = ""): Double = js.native
  def removeCue(id: Double): Unit = js.native
  def clearCues(): Unit = js.native
}

@js.native
@JSGlobal("p5.File")
class File extends js.Object {
  var file: js.Any = js.native
  var `type`: js.Any = js.native
  var subtype: js.Any = js.native
  var name: js.Any = js.native
  var size: js.Any = js.native
  var data: js.Any = js.native
}

@js.native
@JSGlobal("p5.SoundFile")
class SoundFile extends js.Object {
  def isLoaded(): Boolean = js.native
  def play(
            startTime: Double = 1.0,
            rate: Double = 1.0,
            amp: Double = 1.0,
            cueStart: Double = 1.0,
            duration: Double = 1.0
          ): Unit = js.native
  def playMode(str: String): Unit = js.native
  def pause(startTime: Double = 1.0): Unit = js.native
  def loop(
            startTime: Double = 1.0,
            rate: Double = 1.0,
            amp: Double = 1.0,
            cueLoopStart: Double = 1.0,
            duration: Double = 1.0
          ): Unit = js.native
  def isPlaying(): Boolean = js.native
  def isPaused(): Boolean = js.native
  def stop(startTime: Double = 1.0): Unit = js.native
  def setVolume(volume: Double | js.Any, rampTime: Double = 1.0, timeFromNow: Double = 1.0): Unit = js.native
  def rate(playbackRate: Double = 1.0): Unit = js.native
  def duration(): Double = js.native
  def currentTime(): Double = js.native
  def jump(cueTime: Double, uuration: Double): Unit = js.native
  def channels(): Double = js.native
  def sampleRate(): Double = js.native
  def frames(): Double = js.native
  def reverseBuffer(): Unit = js.native
  def onended(callback: js.Function0[Any]): Unit = js.native
  def connect(`object`: js.Any = ""): Unit = js.native
  def disconnect(): Unit = js.native
  def setPath(path: String, callback: js.Function0[Any]): Unit = js.native
  def processPeaks(
                    callback: js.Function0[Any],
                    initThreshold: Double = 1.0,
                    minThreshold: Double = 1.0,
                    minPeaks: Double = 1.0
                  ): js.Array[js.Any] = js.native
  def addCue(time: Double, callback: js.Function0[Any], value: js.Any = ""): Double = js.native
  def removeCue(id: Double): Unit = js.native
  def clearCues(): Unit = js.native
}


// https://github.com/processing/p5.js/blob/master/src/core/shape/vertex.js
@js.native
trait Shape extends js.Object {
  //POINTS, LINES, TRIANGLES, TRIANGLE_FAN TRIANGLE_STRIP, QUADS, or QUAD_STRIP
  def beginShape(kind: js.UndefOr[String] = js.undefined): Unit = js.native
  // CLOSE
  def endShape(mode: js.UndefOr[String] = js.undefined): Unit = js.native

}



@js.native
@JSGlobal("p5.Amplitude")
class Amplitude protected () extends js.Object {
  def this(smoothing: Double = 1.0) = this()
  def getLevel(channel: Double = 1.0): Double = js.native
  def toggleNormalize(boolean: Boolean = false): Unit = js.native
  def smooth(set: Double): Unit = js.native
}



@js.native
@JSGlobal("p5.Signal")
class Signal extends js.Object {
}

@js.native
@JSGlobal("p5.Env")
class Env extends js.Object {
  var attackTime: js.Any = js.native
  var attackLevel: js.Any = js.native
  var decayTime: js.Any = js.native
  var decayLevel: js.Any = js.native
  var releaseTime: js.Any = js.native
  var releaseLevel: js.Any = js.native
  def set(attackTime: Double, attackLevel: Double, decayTime: Double, decayLevel: Double, releaseTime: Double, releaseLevel: Double): Unit = js.native
  def setADSR(attackTime: Double, decayTime: Double = 1.0, susRatio: Double = 1.0, releaseTime: Double = 1.0): Unit = js.native
  def setRange(aLevel: Double, rLevel: Double): Unit = js.native
  def setInput(unit: js.Any): Unit = js.native
  def setExp(isExp: Boolean): Unit = js.native
  def play(unit: js.Any, startTime: Double = 1.0, sustainTime: Double = 1.0): Unit = js.native
  def triggerAttack(unit: js.Any, secondsFromNow: Double): Unit = js.native
  def triggerRelease(unit: js.Any, secondsFromNow: Double): Unit = js.native
  def ramp(unit: js.Any, secondsFromNow: Double, v: Double, v2: Double = 1.0): Unit = js.native
  def add(number: Double): Env = js.native
  def mult(number: Double): Env = js.native
  def scale(inMin: Double, inMax: Double, outMin: Double, outMax: Double): Env = js.native
}

@js.native
@JSGlobal("p5.Pulse")
class Pulse protected () extends js.Object {
  def this(freq: Double = 1.0, w: Double = 1.0) = this()
  def width(width: Double = 1.0): Unit = js.native
}

@js.native
@JSGlobal("p5.Noise")
class Noise protected () extends js.Object {
  def this(`type`: String) = this()
  def setType(`type`: String = ""): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
  def pan(panning: Double, timeFromNow: Double): Unit = js.native
  def connect(unit: js.Any): Unit = js.native
  def disconnect(): Unit = js.native
}

@js.native
@JSGlobal("p5.AudioIn")
class AudioIn extends js.Object {
  var enabled: js.Any = js.native
  def start(successCallback: js.Function0[Any], errorCallback: js.Function0[Any]): Unit = js.native
  def stop(): Unit = js.native
  def connect(unit: js.Any = ""): Unit = js.native
  def disconnect(): Unit = js.native
  def getLevel(smoothing: Double = 1.0): Double = js.native
  def amp(vol: Double, time: Double = 1.0): Unit = js.native
  def getSources(callback: js.Function0[Any]): Unit = js.native
  def setSource(num: Double): Unit = js.native
}

@js.native
@JSGlobal("p5.Filter")
class Filter extends js.Object {
  var biquadFilter: js.Any = js.native
  def set(freq: Double, res: Double, timeFromNow: Double = 1.0): Unit = js.native
  def freq(freq: Double, timeFromNow: Double = 1.0): Double = js.native
  def res(res: Double, timeFromNow: Double = 1.0): Double = js.native
  def setType(UNKNOWN: String): Unit = js.native
  def amp(volume: Double, rampTime: Double = 1.0, timeFromNow: Double = 1.0): Unit = js.native
  def connect(unit: js.Any): Unit = js.native
  def disconnect(): Unit = js.native
}

@js.native
@JSGlobal("p5.Delay")
class Delay extends js.Object {
  var leftDelay: js.Any = js.native
  var rightDelay: js.Any = js.native
  def process(Signal: js.Any, delayTime: Double = 1.0, feedback: Double = 1.0, lowPass: Double = 1.0): Unit = js.native
  def delayTime(delayTime: Double): Unit = js.native
  def feedback(feedback: Double | js.Any): Unit = js.native
  def filter(cutoffFreq: Double | js.Any, res: Double | js.Any): Unit = js.native
  def setType(`type`: String | Double): Unit = js.native
  def amp(volume: Double, rampTime: Double = 1.0, timeFromNow: Double = 1.0): Unit = js.native
  def connect(unit: js.Any): Unit = js.native
  def disconnect(): Unit = js.native
}

@js.native
@JSGlobal("p5.Reverb")
class Reverb extends js.Object {
  def process(src: js.Any, seconds: Double = 1.0, decayRate: Double = 1.0, reverse: Boolean = false): Unit = js.native
  def set(seconds: Double = 1.0, decayRate: Double = 1.0, reverse: Boolean = false): Unit = js.native
  def amp(volume: Double, rampTime: Double = 1.0, timeFromNow: Double = 1.0): Unit = js.native
  def connect(unit: js.Any): Unit = js.native
  def disconnect(): Unit = js.native
}

@js.native
@JSGlobal("p5.Convolver")
class Convolver protected () extends js.Object {
  def this(path: String, callback: js.Function0[Any] = () => (), errorCallback: js.Function0[Any] = () => ()) = this()
  var convolverNode: js.Any = js.native
  def createConvolver(path: String, callback: js.Function0[Any] = () => (), errorCallback: js.Function0[Any] = () => ()): Convolver = js.native
  def process(src: js.Any): Unit = js.native
  var impulses: js.Any = js.native
  def addImpulse(path: String, callback: js.Function0[Any], errorCallback: js.Function0[Any]): Unit = js.native
  def resetImpulse(path: String, callback: js.Function0[Any], errorCallback: js.Function0[Any]): Unit = js.native
  def toggleImpulse(id: String | Double): Unit = js.native
}

@js.native
@JSGlobal("p5.Phrase")
class Phrase protected () extends js.Object {
  def this(name: String, callback: js.Function0[Any], sequence: js.Array[js.Any]) = this()
  var sequence: js.Any = js.native
}

@js.native
@JSGlobal("p5.Part")
class Part protected () extends js.Object {
  def this(steps: Double = 1.0, tatums: Double = 1.0) = this()
  def setBPM(BPM: Double, rampTime: Double = 1.0): Unit = js.native
  def getBPM(): Double = js.native
  def start(time: Double = 1.0): Unit = js.native
  def loop(time: Double = 1.0): Unit = js.native
  def noLoop(): Unit = js.native
  def stop(time: Double = 1.0): Unit = js.native
  def pause(time: Double): Unit = js.native
  def addPhrase(phrase: Phrase): Unit = js.native
  def removePhrase(phraseName: String): Unit = js.native
  def getPhrase(phraseName: String): Unit = js.native
  def replaceSequence(phraseName: String, sequence: js.Array[js.Any]): Unit = js.native
  def onStep(callback: js.Function0[Any]): Unit = js.native
}

@js.native
@JSGlobal("p5.Score")
class Score extends js.Object {
  def start(): Unit = js.native
  def stop(): Unit = js.native
  def pause(): Unit = js.native
  def loop(): Unit = js.native
  def noLoop(): Unit = js.native
}

@js.native
@JSGlobal("p5.SoundRecorder")
class SoundRecorder extends js.Object {
  def setInput(unit: js.Any = ""): Unit = js.native
  def record(soundFile: SoundFile, duration: Double = 1.0, callback: js.Function0[Any] = () => ()): Unit = js.native
  def stop(): Unit = js.native
  def saveSound(soundFile: SoundFile, name: String): Unit = js.native
}

@js.native
@JSGlobal("p5.PeakDetect")
class PeakDetect protected () extends js.Object {
  def this(freq1: Double = 1.0, freq2: Double = 1.0, threshold: Double = 1.0, framesPerPeak: Double = 1.0) = this()
  def update(fftObject: FFT): Unit = js.native
  def onPeak(callback: js.Function0[Any], `val`: js.Any = ""): Unit = js.native
}

@js.native
@JSGlobal("p5.Gain")
class Gain extends js.Object {
  def setInput(src: js.Any): Unit = js.native
  def connect(unit: js.Any): Unit = js.native
  def disconnect(): Unit = js.native
  def amp(volume: Double, rampTime: Double = 1.0, timeFromNow: Double = 1.0): Unit = js.native
}
