package samples

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExportTopLevel, _}
import org.scalajs.dom
import org.scalajs.dom.document
import p5.js.modules.{FFT, Oscillator}

// This import decides which mode.
import p5.js.modes.instance.p5

@JSExportTopLevel("P5SoundSampleApp")
@JSExportAll
object P5SoundSampleApp {

  // https://processing.github.io/p5.js-sound/examples/oscillatorMod_FM/
  def main(args: js.Array[String]): Unit = {
    println("Hello world p5.js!")


    val sketchFn: js.Function1[p5, Unit] = (sketch: p5) => {

      var modulator: Oscillator = null
      var fft: FFT = null
      var waveform: js.Array[Double] = null

      import sketch._
      setup = () => {
        createCanvas(800,400)
        noFill()


        // Start the audio context on a click/touch event

        val myDiv = createDiv("click to start audio")
        myDiv.style("color: white")
        myDiv.position(100, 100)

        // implicit conversion
        // https://www.scala-js.org/doc/interoperability/types.html
        val onFulfilled: js.Function1[Unit, Unit] = Unit => {
          myDiv.remove()
          ()
        }

        userStartAudio().`then`[Unit](
          onFulfilled)


        val carrier = Oscillator("sine")
        carrier.amp(1)
        carrier.freq(220)
        carrier.start()

        modulator = Oscillator("sawtooth")
        modulator.disconnect()
        modulator.amp(1)
        modulator.freq(4)
        modulator.start()

        carrier.freq(modulator.mult(200).add(100))

        fft = FFT()

        // switches
        document.getElementById("start").addEventListener("click", (e: dom.Event) => {
          carrier.start()
        })
        document.getElementById("stop").addEventListener("click", (e: dom.Event) => {
          carrier.stop(0)
        })

        ()
      }

      draw = () => {

        background(30)

        // map mouseY to moodulator freq between 0 and 20hz
        val modFreq = map(mouseY, 0, height, 20, 0)
        modulator.freq(modFreq)

        // change the original amplitude of the sawOsc, before it's scaled.
        // negative amp reverses the waveform, and sounds percussive
        var modAmp = map(mouseX, 0, width, -1, 1)
        modulator.amp(modAmp)

        // analyze the waveform
        waveform = fft.waveform()

        // draw the shape of the waveform
        stroke(255)
        strokeWeight(10)
        beginShape()

        for (i <- 0 until waveform.length) {
          val x = map(i, 0, waveform.length, 0, width)
          val y = map(waveform(i), -1, 1, -height/2, height/2)
          vertex(x, y + height/2)
        }
        endShape()
      }

    }

    // instantiate
    val myp5 = p5(sketchFn)


    println("the main ends.")
  }
}
