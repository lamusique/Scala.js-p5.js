package tutorial.webapp

import p5.js.p5._
import p5.js.lib._
import p5.js.p5

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExportTopLevel, _}
import scala.scalajs.js.|

object TutorialP5jsApp {
  def main(args: Array[String]): Unit = {
    println("Hello world p5.js!")

    lazy val window: Window = js.Dynamic.global.window.asInstanceOf[Window]
    println(window)

    // create a 400x400 black canvas
    setup = () => {
      window.createCanvas(400, 400)
      window.background(0)
      //noStroke()
      ()
    }

//    val setupFn = () => {
//      println("in setup")
//      createCanvas(400, 400)
//      background(50)
//      noStroke()
//      ()
//    }
//
//    setup = setupFn
//    setup = setupFn
//    setup()


    // if the mouse is pressed,
    // draw a white circle at the x,y coordinates of the mouse
//    draw = () => {
//      if(mouseIsPressed) {
//        println(mouseX)
//        println(mouseY)
//        ellipse(mouseX, mouseY, 20, 20)
//      }
//      ()
//    }
    val drawFn = () => {
      if(window.mouseIsPressed) {
        println(window.mouseX)
        println(window.mouseY)
        window.ellipse(window.mouseX, window.mouseY, 20, 20)
      }
      ()
    }
    draw = drawFn

//    val s = (sketch: p5) => {
//      sketch.setup = () = {
//
//      }
//
//    }
//    lazy val p5: p5 = js.Dynamic.newInstance(p5,)
//    println(p5)




    window.setup = setup
    window.draw = drawFn


//    val x = Globals.foo
//    println(Globals.foo)
//    println(x)
//    Globals.foo = 24
//    println(Globals.foo)
//    println(x)
//
//    val y = new Bar
//    println(y)
//    val z = Bar
//    println(z)

    val foo = new Foo
    println(foo)
    println(foo.x)
    println("the main ends.")
  }
}

//@js.native
//@JSGlobalScope
object A extends js.Object {
  //@JSExportStatic
  val a = 1

}

object GlobalObject {
  @JSExportTopLevel("bb")
  def foo(): Int = 10
}

@JSExportTopLevel("Foo")
class Foo extends js.Object {
  //@JSExportStatic
  val x: Int = 4
  //@JSExportStatic
  def bar(x: Int): Int = x + 1
}

@js.native
@JSGlobal
class Window extends js.Object {
  //var ondragend: js.Function1[DragEvent, _] = js.native
  var setup: js.Function0[Unit] = js.native
  var draw: js.Function0[Unit] = js.native
  def createCanvas(w: Double, h: Double, renderer: String = ""): js.Dynamic = js.native
  def background(
                  v1: Double | String | Color | Image,
                  v2: Double = 1.0,
                  v3: Double = 1.0,
                  a: Double = 1.0
                ): Unit = js.native
  var mouseIsPressed: Boolean = js.native
  var mouseX: Double = js.native
  var mouseY: Double = js.native
  def ellipse(a: Double, b: Double, c: Double, d: Double): p5 = js.native
}
//object Window {
//  implicit def win2greenify(win: )
//}
//
//implicit class StrToDate(val s: String) {
//  def toDate = convertToDate(s)
//}
//"2015-10-09".toDate


//@JSExportTopLevel("window")
//@JSGlobalScope
//@JSExportAll
//class WindowGreenify extends Window {
//  def greenify(): this.type = ???
//  def setup: () => Unit = () => {
//    createCanvas(400, 400)
//    background(0)
//    noStroke()
//    ()
//  }
//  def hello() = println("Hello!")
//}
//object WindowGreenify {
//  implicit def win2greenify(win: Window): WindowGreenify =
//    win.asInstanceOf[WindowGreenify]
//}


//@js.native
//@JSGlobalScope
//object Globals extends js.Object {
//  var foo: Int = js.native
//}
//
//@js.native
//@JSGlobal
//class Bar extends js.Object
//
//@js.native
//@JSGlobal
//object Bar extends js.Object
