package p5.js

object P5js {

}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|


trait p5
@js.native
//object p5 extends js.GlobalScope {
@JSGlobal
object p5 extends js.Object {

//@js.native
//trait P5 extends js.Object {

  var HALF_PI: js.Any = js.native

  var PI: js.Any = js.native

  var QUARTER_PI: js.Any = js.native

  var TAU: js.Any = js.native

  var TWO_PI: js.Any = js.native

  var setup: js.Function0[Unit] = js.native

  var draw: js.Function0[Unit] = js.native

  var frameCount: js.Any = js.native

  var focused: js.Any = js.native

  var displayWidth: js.Any = js.native

  var displayHeight: js.Any = js.native

  var windowWidth: js.Any = js.native

  var windowHeight: js.Any = js.native

  var width: js.Any = js.native

  var height: js.Any = js.native

  var deviceOrientation: js.Any = js.native

  var accelerationX: js.Any = js.native

  var accelerationY: js.Any = js.native

  var accelerationZ: js.Any = js.native

  var pAccelerationX: js.Any = js.native

  var pAccelerationY: js.Any = js.native

  var pAccelerationZ: js.Any = js.native

  var rotationX: js.Any = js.native

  var rotationY: js.Any = js.native

  var rotationZ: js.Any = js.native

  var pRotationX: js.Any = js.native

  var pRotationY: js.Any = js.native

  var pRotationZ: js.Any = js.native

  var keyIsPressed: js.Any = js.native

  var key: js.Any = js.native

  var keyCode: js.Any = js.native

  var mouseX: Double = js.native

  var mouseY: Double = js.native

  var pmouseX: js.Any = js.native

  var pmouseY: js.Any = js.native

  var winMouseX: js.Any = js.native

  var winMouseY: js.Any = js.native

  var pwinMouseX: js.Any = js.native

  var pwinMouseY: js.Any = js.native

  var mouseButton: js.Any = js.native

  var mouseIsPressed: Boolean = js.native

  var touchX: js.Any = js.native

  var touchY: js.Any = js.native

  var ptouchX: js.Any = js.native

  var ptouchY: js.Any = js.native

  var touchIsDown: js.Any = js.native

  def plane(width: Double, height: Double): p5 = js.native

  def sphere(radius: Double, detail: Double = 1.0): Unit = js.native

  def ellipsoid(
                 radiusx: Double,
                 radiusy: Double,
                 radiusz: Double,
                 detail: Double = 1.0
               ): p5 = js.native

  def cylinder(radius: Double, height: Double, detail: Double = 1.0): p5 = js.native

  def cone(radius: Double, height: Double, detail: Double = 1.0): Unit = js.native

  def torus(radius: Double, tubeRadius: Double, detail: Double = 1.0): Unit = js
    .native

  def box(width: Double, height: Double, depth: Double): p5 = js.native

  def camera(x: Double, y: Double, z: Double): p5 = js.native

  def perspective(fovy: Double, aspect: Double, near: Double, far: Double): p5 = js.native

  def ortho(
             left: Double,
             right: Double,
             bottom: Double,
             top: Double,
             near: Double,
             far: Double
           ): p5 = js.native

  def ambientLight(
                    v1: Double | js.Array[js.Any] | String | lib.Color,
                    v2: Double = 1.0,
                    v3: Double = 1.0,
                    a: Double = 1.0
                  ): p5 = js.native

  def normalMaterial(): p5 = js.native

  def texture(): p5 = js.native

  def basicMaterial(
                     v1: Double | js.Array[js.Any] | String | lib.Color,
                     v2: Double = 1.0,
                     v3: Double = 1.0,
                     a: Double = 1.0
                   ): p5 = js.native

  def ambientMaterial(
                       v1: Double | js.Array[js.Any] | String | lib.Color,
                       v2: Double = 1.0,
                       v3: Double = 1.0,
                       a: Double = 1.0
                     ): p5 = js.native

  def specularMaterial(
                        v1: Double | js.Array[js.Any] | String | lib.Color,
                        v2: Double = 1.0,
                        v3: Double = 1.0,
                        a: Double = 1.0
                      ): p5 = js.native

  def alpha(obj: js.Any): Unit = js.native

  def blue(obj: js.Any): Unit = js.native

  def brightness(color: js.Any): Unit = js.native

  def color(
             v1: Double | String,
             v2: Double = 1.0,
             v3: Double = 1.0,
             alpha: Double = 1.0
           ): js.Array[js.Any] = js.native

  def green(color: js.Any): Unit = js.native

  def hue(color: js.Any): Unit = js.native

  def lightness(color: js.Any): Unit = js.native

  def red(obj: js.Any): Unit = js.native

  def saturation(color: js.Any): Unit = js.native

  def background(
                  v1: Double | String | lib.Color | lib.Image,
                  v2: Double = 1.0,
                  v3: Double = 1.0,
                  a: Double = 1.0
                ): Unit = js.native

  def clear(): Unit = js.native

  def fill(
            v1: Double | js.Array[js.Any] | String | lib.Color,
            v2: Double = 1.0,
            v3: Double = 1.0,
            a: Double = 1.0
          ): Unit = js.native

  def noFill(): Unit = js.native

  def noStroke(): Unit = js.native

  def stroke(
              v1: Double | js.Array[js.Any] | String | lib.Color,
              v2: Double = 1.0,
              v3: Double = 1.0,
              a: Double = 1.0
            ): Unit = js.native

  def arc(
           a: Double,
           b: Double,
           c: Double,
           d: Double,
           start: Double,
           stop: Double,
           mode: String = ""
         ): js.Dynamic = js.native

  def ellipse(a: Double, b: Double, c: Double, d: Double): p5 = js.native

  def line(x1: Double, y1: Double, x2: Double, y2: Double): p5 = js.native

  def point(x: Double, y: Double): p5 = js.native

  def quad(
            x1: Double,
            y1: Double,
            x2: Double,
            y2: Double,
            x3: Double,
            y3: Double,
            x4: Double,
            y4: Double
          ): p5 = js.native

  def rect(
            x: Double,
            y: Double,
            w: Double,
            h: Double,
            tl: Double = 1.0,
            tr: Double = 1.0,
            br: Double = 1.0,
            bl: Double = 1.0
          ): p5 = js.native

  def triangle(
                x1: Double,
                y1: Double,
                x2: Double,
                y2: Double,
                x3: Double,
                y3: Double
              ): p5 = js.native

  def noSmooth(): p5 = js.native

  def smooth(): p5 = js.native

  def strokeWeight(weight: Double): p5 = js.native

  def preload(): Unit = js.native

  def remove(): Unit = js.native

  def bezier(
              x1: Double,
              y1: Double,
              x2: Double,
              y2: Double,
              x3: Double,
              y3: Double,
              x4: Double,
              y4: Double
            ): js.Dynamic = js.native

  def bezierPoint(
                   a: Double,
                   b: Double,
                   c: Double,
                   d: Double,
                   t: Double
                 ): Double = js.native

  def bezierTangent(
                     a: Double,
                     b: Double,
                     c: Double,
                     d: Double,
                     t: Double
                   ): Double = js.native

  def curve(
             x1: Double,
             y1: Double,
             x2: Double,
             y2: Double,
             x3: Double,
             y3: Double,
             x4: Double,
             y4: Double
           ): js.Dynamic = js.native

  def curveTightness(amount: Double): js.Dynamic = js.native

  def curvePoint(
                  a: Double,
                  b: Double,
                  c: Double,
                  d: Double,
                  t: Double
                ): Double = js.native

  def curveTangent(
                    a: Double,
                    b: Double,
                    c: Double,
                    d: Double,
                    t: Double
                  ): Double = js.native

  def print(contents: js.Any): Unit = js.native

  def frameRate(fps: Double = 1.0): Double = js.native

  def noCursor(): Unit = js.native

  def windowResized(): Unit = js.native

  def fullscreen(`val`: Boolean = false): Boolean = js.native

  def pixelDensity(`val`: Double = 1.0): Double = js.native

  def displayDensity(): Double = js.native

  def getURL(): String = js.native

  def getURLPath(): js.Array[js.Any] = js.native

  def getURLParams(): js.Dynamic = js.native

  def createCanvas(w: Double, h: Double, renderer: String = ""): js.Dynamic = js.native

  def resizeCanvas(): Unit = js.native

  def noCanvas(): Unit = js.native

  def createGraphics(w: Double, h: Double, renderer: String): js.Dynamic = js.native

  def noLoop(): Unit = js.native

  def loop(): Unit = js.native

  def push(): Unit = js.native

  def pop(): Unit = js.native

  def redraw(): Unit = js.native

  def applyMatrix(
                   n00: Double,
                   n01: Double,
                   n02: Double,
                   n10: Double,
                   n11: Double,
                   n12: Double
                 ): p5 = js.native

  def resetMatrix(): p5 = js.native

  def rotate(angle: Double): p5 = js.native

  def shearX(angle: Double): p5 = js.native

  def shearY(angle: Double): p5 = js.native

  def translate(x: Double, y: Double): p5 = js.native

  def beginContour(): js.Dynamic = js.native

  def bezierVertex(
                    x2: Double,
                    y2: Double,
                    x3: Double,
                    y3: Double,
                    x4: Double,
                    y4: Double
                  ): js.Dynamic = js.native

  def curveVertex(x: Double, y: Double): js.Dynamic = js.native

  def endContour(): js.Dynamic = js.native

  def quadraticVertex(
                       cx: Double,
                       cy: Double,
                       x3: Double,
                       y3: Double
                     ): js.Dynamic = js.native

  def vertex(x: Double, y: Double): js.Dynamic = js.native

  def setMoveThreshold(value: Double): Unit = js.native

  def setShakeThreshold(value: Double): Unit = js.native

  def deviceMoved(): Unit = js.native

  def deviceTurned(): Unit = js.native

  def deviceShaken(): Unit = js.native

  def keyPressed(): Unit = js.native

  def keyReleased(): Unit = js.native

  def keyTyped(): Unit = js.native

  def keyIsDown(code: Double): Boolean = js.native

  def mouseMoved(): Unit = js.native

  def mouseDragged(): Unit = js.native

  def mousePressed(): Unit = js.native

  def mouseReleased(): Unit = js.native

  def mouseClicked(): Unit = js.native

  def mouseWheel(): Unit = js.native

  def touchStarted(): Unit = js.native

  def touchMoved(): Unit = js.native

  def touchEnded(): Unit = js.native

  def createImage(width: Double, height: Double): lib.Image = js.native

  def saveFrames(
                  filename: String,
                  extension: String,
                  duration: Double,
                  framerate: Double,
                  callback: js.Function0[Any] = () => ()
                ): Unit = js.native

  def image(
             img: lib.Image,
             sx: Double = 0.0,
             sy: Double = 0.0,
             sWidth: Double = 1.0,
             sHeight: Double = 1.0,
             dx: Double = 0.0,
             dy: Double = 0.0,
             dWidth: Double = 1.0,
             dHeight: Double = 1.0
           ): Unit = js.native

  def tint(
            v1: Double | js.Array[js.Any],
            v2: Double | js.Array[js.Any] = ???,
            v3: Double | js.Array[js.Any] = ???,
            a: Double | js.Array[js.Any] = ???
          ): Unit = js.native

  def noTint(): Unit = js.native

  def imageMode(m: String): Unit = js.native

  def filter(filterType: String, filterParam: Double): Unit = js.native

  def get(
           x: Double = 0.0,
           y: Double = 0.0,
           w: Double = 1.0,
           h: Double = 1.0
         ): js.Array[js.Any] | lib.Image = js.native

  def loadPixels(): Unit = js.native

  def set(x: Double, y: Double, c: Double | js.Array[js.Any] | js.Any): Unit = js.native

  def loadFont(
                path: String,
                callback: js.Function0[Any] = () => ()
              ): js.Dynamic = js.native

  def loadJSON(
                path: String,
                callback: js.Function0[Any] = () => (),
                errorCallback: js.Function0[Any] = () => (),
                datatype: String = ""
              ): js.Any | js.Array[js.Any] = js.native

  def loadStrings(
                   filename: String,
                   callback: js.Function0[Any] = () => (),
                   errorCallback: js.Function0[Any] = () => ()
                 ): js.Array[js.Any] = js.native

  def loadXML(
               filename: String,
               callback: js.Function0[Any] = () => (),
               errorCallback: js.Function0[Any] = () => ()
             ): js.Dynamic = js.native

  def httpGet(
               path: String,
               data: js.Any = "",
               datatype: String = "",
               callback: js.Function0[Any] = () => (),
               errorCallback: js.Function0[Any] = () => ()
             ): Unit = js.native

  def httpPost(
                path: String,
                data: js.Any = "",
                datatype: String = "",
                callback: js.Function0[Any] = () => (),
                errorCallback: js.Function0[Any] = () => ()
              ): Unit = js.native

  def httpDo(
              path: String,
              method: String = "",
              data: js.Any = "",
              datatype: String = "",
              callback: js.Function0[Any] = () => (),
              errorCallback: js.Function0[Any] = () => ()
            ): Unit = js.native

  def saveJSON(
                json: js.Array[js.Any] | js.Any,
                filename: String,
                optimize: Boolean = false
              ): Unit = js.native

  def saveStrings(list: js.Array[js.Any], filename: String): Unit = js.native

  def saveTable(
                 table: lib.Table,
                 filename: String,
                 options: String = ""
               ): Unit = js.native

  def abs(n: Double): Double = js.native

  def ceil(n: Double): Double = js.native

  def constrain(n: Double, low: Double, high: Double): Double = js.native

  def exp(n: Double): Double = js.native

  def floor(n: Double): Double = js.native

  def lerp(start: Double, stop: Double, amt: Double): Double = js.native

  def log(n: Double): Double = js.native

  def mag(a: Double, b: Double): Double = js.native

  def map(
           value: Double,
           start1: Double,
           stop1: Double,
           start2: Double,
           stop: Double
         ): Double = js.native

  def max(n0: Double | js.Array[js.Any]): Double = js.native

  def min(n0: Double | js.Array[js.Any]): Double = js.native

  def norm(value: Double, start: Double, stop: Double): Double = js.native

  def pow(n: Double, e: Double): Double = js.native

  def round(n: Double): Double = js.native

  def sq(n: Double): Double = js.native

  def sqrt(n: Double): Double = js.native

  def createVector(x: Double = 0.0, y: Double = 0.0, z: Double = 0.0): Unit = js.native

  def noise(x: Double, y: Double, z: Double): Double = js.native

  def noiseDetail(lod: Double, falloff: Double): Unit = js.native

  def noiseSeed(seed: Double): Unit = js.native

  def randomSeed(seed: Double): Unit = js.native

  def random(min: Double, max: Double): Double = js.native

  def randomGaussian(mean: Double, sd: Double): Double = js.native

  def acos(value: Double): Double = js.native

  def asin(value: Double): Double = js.native

  def atan(value: Double): Double = js.native

  def atan2(y: Double, x: Double): Double = js.native

  def cos(angle: Double): Double = js.native

  def sin(angle: Double): Double = js.native

  def tan(angle: Double): Double = js.native

  def degrees(radians: Double): Double = js.native

  def radians(degrees: Double): Double = js.native

  def textLeading(leading: Double): js.Any | Double = js.native

  def textSize(theSize: Double): js.Any | Double = js.native

  def textWidth(theText: String): Double = js.native

  def text(
            str: String,
            x: Double,
            y: Double,
            x2: Double,
            y2: Double
          ): js.Dynamic = js.native

  def textFont(f: js.Any | String): js.Dynamic = js.native

  def append(array: js.Array[js.Any], value: js.Any): Unit = js.native

  def concat(a: js.Array[js.Any], b: js.Array[js.Any]): js.Array[js.Any] = js.native

  def reverse(list: js.Array[js.Any]): Unit = js.native

  def shorten(list: js.Array[js.Any]): js.Array[js.Any] = js.native

  def shuffle(
               array: js.Array[js.Any],
               bool: Boolean = false
             ): js.Array[js.Any] = js.native

  def sort(list: js.Array[js.Any], count: Double = 1.0): Unit = js.native

  def splice(list: js.Array[js.Any], value: js.Any, position: Double): Unit = js.native

  def subset(
              list: js.Array[js.Any],
              start: Double,
              count: Double = 1.0
            ): js.Array[js.Any] = js.native

  def float(str: String): Double = js.native

  def int(n: String | Boolean | Double | js.Array[js.Any]): Double = js.native

  def str(n: String | Boolean | Double | js.Array[js.Any]): String = js.native

  def boolean(n: String | Boolean | Double | js.Array[js.Any]): Boolean = js.native

  def byte(n: String | Boolean | Double | js.Array[js.Any]): Double = js.native

  def char(n: String | Double | js.Array[js.Any]): String = js.native

  def unchar(n: String | js.Array[js.Any]): Double = js.native

  def hex(n: Double | js.Array[js.Any]): String = js.native

  def unhex(n: String | js.Array[js.Any]): Double = js.native

  def join(list: js.Array[js.Any], separator: String): String = js.native

  def `match`(str: String, regexp: String): js.Array[js.Any] = js.native

  def matchAll(str: String, regexp: String): js.Array[js.Any] = js.native

  def nf(
          num: Double | js.Array[js.Any],
          left: Double = 1.0,
          right: Double = 1.0
        ): String | js.Array[js.Any] = js.native

  def nfc(
           num: Double | js.Array[js.Any],
           right: Double = 1.0
         ): String | js.Array[js.Any] = js.native

  def nfp(
           num: Double | js.Array[js.Any],
           left: Double = 1.0,
           right: Double = 1.0
         ): String | js.Array[js.Any] = js.native

  def nfs(
           num: Double | js.Array[js.Any],
           left: Double = 1.0,
           right: Double = 1.0
         ): String | js.Array[js.Any] = js.native

  def split(value: String, delim: String): js.Array[js.Any] = js.native

  def splitTokens(value: String, delim: String = ""): js.Array[js.Any] = js.native

  def trim(str: String | js.Array[js.Any] = ???): String | js.Array[js.Any] = js.native

  def day(): Double = js.native

  def hour(): Double = js.native

  def minute(): Double = js.native

  def millis(): Double = js.native

  def month(): Double = js.native

  def second(): Double = js.native

  def year(): Double = js.native

  def selectAll(name: String, container: String = ""): js.Array[js.Any] = js.native

  def removeElements(): Unit = js.native

  def getAudioContext(): js.Dynamic = js.native

  def getMasterVolume(): Double = js.native

  def masterVolume(
                    volume: Double | js.Any,
                    rampTime: Double = 1.0,
                    timeFromNow: Double = 1.0
                  ): Unit = js .native

  def sampleRate(): Double = js.native

  def midiToFreq(midiNote: Double): Double = js.native
}
