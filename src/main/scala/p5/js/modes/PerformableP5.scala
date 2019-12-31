package p5.js.modes

import scala.scalajs.js

trait PerformableP5 {
  def setupFn: js.Function0[Unit] = () => setup
  def setup(): Unit

  def drawFn: js.Function0[Unit] = () => draw
  def draw(): Unit


  def keyPressedFn: js.Function0[Unit] = () => keyPressed
  def keyPressed(): Unit

}
