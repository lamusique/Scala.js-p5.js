package p5.js.modules.core.p5

import p5.js.modules.Color
import p5.js.p5

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|


// https://github.com/processing/p5.js/blob/master/src/dom/dom.js
// https://github.com/processing/p5.js/blob/master/src/core/p5.Element.js
// p5.js/src/core/p5.Element.js
@js.native
@JSGlobal("p5.Element")
class Element protected () extends js.Object {

  /**
   *
   * Attaches the element to the parent specified. A way of setting
   * the container for the element. Accepts either a string ID, DOM
   * node, or <a href="#/p5.Element">p5.Element</a>. If no arguments given, parent node is returned.
   * For more ways to position the canvas, see the
   * <a href='https://github.com/processing/p5.js/wiki/Positioning-your-canvas'>
   * positioning the canvas</a> wiki page.
   *
   * @method parent
   * @param  {String|p5.Element|Object} parent the ID, DOM node, or <a href="#/p5.Element">p5.Element</a>
   *                         of desired parent element
   * @chainable
   *
   * @example
   * <div class="norender notest"><code>
   * // in the html file:
   * // &lt;div id="myContainer">&lt;/div>
   *
   * // in the js file:
   * let cnv = createCanvas(100, 100);
   * cnv.parent('myContainer');
   * </code></div>
   * <div class='norender'><code>
   * let div0 = createDiv('this is the parent');
   * let div1 = createDiv('this is the child');
   * div1.parent(div0); // use p5.Element
   * </code></div>
   * <div class='norender'><code>
   * let div0 = createDiv('this is the parent');
   * div0.id('apples');
   * let div1 = createDiv('this is the child');
   * div1.parent('apples'); // use id
   * </code></div>
   * <div class='norender notest'><code>
   * let elt = document.getElementById('myParentDiv');
   * let div1 = createDiv('this is the child');
   * div1.parent(elt); // use element from page
   * </code></div>
   *
   * @alt
   * no display.
   */
  /**
   * @method parent
   * @return {p5.Element}
   *
   */
  def parent(p: js.UndefOr[String | Element | js.Object] = js.undefined): Element = js.native

  /**
   *
   * Sets the ID of the element. If no ID argument is passed in, it instead
   * returns the current ID of the element.
   * Note that only one element can have a particular id in a page.
   * The <a href="#/p5.Element/class">.class()</a> function can be used
   * to identify multiple elements with the same class name.
   *
   * @method id
   * @param  {String} id ID of the element
   * @chainable
   *
   * @example
   * <div class='norender'><code>
   * function setup() {
   *   let cnv = createCanvas(100, 100);
   *   // Assigns a CSS selector ID to
   *   // the canvas element.
   *   cnv.id('mycanvas');
   * }
   * </code></div>
   *
   * @alt
   * no display.
   */
  /**
   * @method id
   * @return {String} the id of the element
   */
  def id(id: String): Element = js.native
  def id(): String = js.native

  /**
   *
   * Adds given class to the element. If no class argument is passed in, it
   * instead returns a string containing the current class(es) of the element.
   *
   * @method class
   * @param  {String} class class to add
   * @chainable
   *
   * @example
   * <div class='norender'><code>
   * function setup() {
   *   let cnv = createCanvas(100, 100);
   *   // Assigns a CSS selector class 'small'
   *   // to the canvas element.
   *   cnv.class('small');
   * }
   * </code></div>
   *
   * @alt
   * no display.
   */
  /**
   * @method class
   * @return {String} the class of the element
   */
  def `class`(`class`: String): p5 = js.native
  def `class`(): String = js.native

  /**
   * The .<a href="#/p5.Element/mousePressed">mousePressed()</a> function is called once after every time a
   * mouse button is pressed over the element.
   * Some mobile browsers may also trigger this event on a touch screen,
   * if the user performs a quick tap.
   * This can be used to attach element specific event listeners.
   *
   * @method mousePressed
   * @param  {Function|Boolean} fxn function to be fired when mouse is
   *                                pressed over the element.
   *                                if `false` is passed instead, the previously
   *                                firing function will no longer fire.
   * @chainable
   * @example
   * <div class='norender'><code>
   * let cnv;
   * let d;
   * let g;
   * function setup() {
   *   cnv = createCanvas(100, 100);
   *   cnv.mousePressed(changeGray); // attach listener for
   *   // canvas click only
   *   d = 10;
   *   g = 100;
   * }
   *
   * function draw() {
   *   background(g);
   *   ellipse(width / 2, height / 2, d, d);
   * }
   *
   * // this function fires with any click anywhere
   * function mousePressed() {
   *   d = d + 10;
   * }
   *
   * // this function fires only when cnv is clicked
   * function changeGray() {
   *   g = random(0, 255);
   * }
   * </code></div>
   *
   * @alt
   * no display.
   *
   */
  def mousePressed(fxn: js.Function0[Unit] | Boolean): Element = js.native

  /**
   * The .<a href="#/p5.Element/doubleClicked">doubleClicked()</a> function is called once after every time a
   * mouse button is pressed twice over the element. This can be used to
   * attach element and action specific event listeners.
   *
   * @method doubleClicked
   * @param  {Function|Boolean} fxn function to be fired when mouse is
   *                                double clicked over the element.
   *                                if `false` is passed instead, the previously
   *                                firing function will no longer fire.
   * @return {p5.Element}
   * @example
   * <div class='norender'><code>
   * let cnv;
   * let d;
   * let g;
   * function setup() {
   *   cnv = createCanvas(100, 100);
   *   cnv.doubleClicked(changeGray); // attach listener for
   *   // canvas double click only
   *   d = 10;
   *   g = 100;
   * }
   *
   * function draw() {
   *   background(g);
   *   ellipse(width / 2, height / 2, d, d);
   * }
   *
   * // this function fires with any double click anywhere
   * function doubleClicked() {
   *   d = d + 10;
   * }
   *
   * // this function fires only when cnv is double clicked
   * function changeGray() {
   *   g = random(0, 255);
   * }
   * </code></div>
   *
   * @alt
   * no display.
   *
   */
  def doubleClicked(fxn: js.Function0[Unit] | Boolean): Element = js.native

  /**
   * The .<a href="#/p5.Element/mouseWheel">mouseWheel()</a> function is called once after every time a
   * mouse wheel is scrolled over the element. This can be used to
   * attach element specific event listeners.
   * <br><br>
   * The function accepts a callback function as argument which will be executed
   * when the `wheel` event is triggered on the element, the callback function is
   * passed one argument `event`. The `event.deltaY` property returns negative
   * values if the mouse wheel is rotated up or away from the user and positive
   * in the other direction. The `event.deltaX` does the same as `event.deltaY`
   * except it reads the horizontal wheel scroll of the mouse wheel.
   * <br><br>
   * On OS X with "natural" scrolling enabled, the `event.deltaY` values are
   * reversed.
   *
   * @method mouseWheel
   * @param  {Function|Boolean} fxn function to be fired when mouse is
   *                                scrolled over the element.
   *                                if `false` is passed instead, the previously
   *                                firing function will no longer fire.
   * @chainable
   * @example
   * <div class='norender'><code>
   * let cnv;
   * let d;
   * let g;
   * function setup() {
   *   cnv = createCanvas(100, 100);
   *   cnv.mouseWheel(changeSize); // attach listener for
   *   // activity on canvas only
   *   d = 10;
   *   g = 100;
   * }
   *
   * function draw() {
   *   background(g);
   *   ellipse(width / 2, height / 2, d, d);
   * }
   *
   * // this function fires with mousewheel movement
   * // anywhere on screen
   * function mouseWheel() {
   *   g = g + 10;
   * }
   *
   * // this function fires with mousewheel movement
   * // over canvas only
   * function changeSize(event) {
   *   if (event.deltaY > 0) {
   *     d = d + 10;
   *   } else {
   *     d = d - 10;
   *   }
   * }
   * </code></div>
   *
   *
   * @alt
   * no display.
   *
   */
  def mouseWheel(fxn: js.Function0[Unit] | Boolean): Element = js.native

  /**
   * The .<a href="#/p5.Element/mouseReleased">mouseReleased()</a> function is called once after every time a
   * mouse button is released over the element.
   * Some mobile browsers may also trigger this event on a touch screen,
   * if the user performs a quick tap.
   * This can be used to attach element specific event listeners.
   *
   * @method mouseReleased
   * @param  {Function|Boolean} fxn function to be fired when mouse is
   *                                released over the element.
   *                                if `false` is passed instead, the previously
   *                                firing function will no longer fire.
   * @chainable
   * @example
   * <div class='norender'><code>
   * let cnv;
   * let d;
   * let g;
   * function setup() {
   *   cnv = createCanvas(100, 100);
   *   cnv.mouseReleased(changeGray); // attach listener for
   *   // activity on canvas only
   *   d = 10;
   *   g = 100;
   * }
   *
   * function draw() {
   *   background(g);
   *   ellipse(width / 2, height / 2, d, d);
   * }
   *
   * // this function fires after the mouse has been
   * // released
   * function mouseReleased() {
   *   d = d + 10;
   * }
   *
   * // this function fires after the mouse has been
   * // released while on canvas
   * function changeGray() {
   *   g = random(0, 255);
   * }
   * </code></div>
   *
   *
   * @alt
   * no display.
   *
   */
  def mouseReleased(fxn: js.Function0[Unit] | Boolean): Element = js.native

  /**
   * The .<a href="#/p5.Element/mouseClicked">mouseClicked()</a> function is called once after a mouse button is
   * pressed and released over the element.
   * Some mobile browsers may also trigger this event on a touch screen,
   * if the user performs a quick tap.
   * This can be used to attach element specific event listeners.
   *
   * @method mouseClicked
   * @param  {Function|Boolean} fxn function to be fired when mouse is
   *                                clicked over the element.
   *                                if `false` is passed instead, the previously
   *                                firing function will no longer fire.
   * @chainable
   * @example
   * <div class="norender">
   * <code>
   * let cnv;
   * let d;
   * let g;
   *
   * function setup() {
   *   cnv = createCanvas(100, 100);
   *   cnv.mouseClicked(changeGray); // attach listener for
   *   // activity on canvas only
   *   d = 10;
   *   g = 100;
   * }
   *
   * function draw() {
   *   background(g);
   *   ellipse(width / 2, height / 2, d, d);
   * }
   *
   * // this function fires after the mouse has been
   * // clicked anywhere
   * function mouseClicked() {
   *   d = d + 10;
   * }
   *
   * // this function fires after the mouse has been
   * // clicked on canvas
   * function changeGray() {
   *   g = random(0, 255);
   * }
   * </code>
   * </div>
   *
   * @alt
   * no display.
   *
   */
  def mouseClicked(fxn: js.Function0[Unit] | Boolean): Element = js.native

  /**
   * The .<a href="#/p5.Element/mouseMoved">mouseMoved()</a> function is called once every time a
   * mouse moves over the element. This can be used to attach an
   * element specific event listener.
   *
   * @method mouseMoved
   * @param  {Function|Boolean} fxn function to be fired when a mouse moves
   *                                over the element.
   *                                if `false` is passed instead, the previously
   *                                firing function will no longer fire.
   * @chainable
   * @example
   * <div class='norender'><code>
   * let cnv;
   * let d = 30;
   * let g;
   * function setup() {
   *   cnv = createCanvas(100, 100);
   *   cnv.mouseMoved(changeSize); // attach listener for
   *   // activity on canvas only
   *   d = 10;
   *   g = 100;
   * }
   *
   * function draw() {
   *   background(g);
   *   fill(200);
   *   ellipse(width / 2, height / 2, d, d);
   * }
   *
   * // this function fires when mouse moves anywhere on
   * // page
   * function mouseMoved() {
   *   g = g + 5;
   *   if (g > 255) {
   *     g = 0;
   *   }
   * }
   *
   * // this function fires when mouse moves over canvas
   * function changeSize() {
   *   d = d + 2;
   *   if (d > 100) {
   *     d = 0;
   *   }
   * }
   * </code></div>
   *
   *
   * @alt
   * no display.
   *
   */
  def mouseMoved(fxn: js.Function0[Unit] | Boolean): Element = js.native

  /**
   * The .<a href="#/p5.Element/mouseOver">mouseOver()</a> function is called once after every time a
   * mouse moves onto the element. This can be used to attach an
   * element specific event listener.
   *
   * @method mouseOver
   * @param  {Function|Boolean} fxn function to be fired when a mouse moves
   *                                onto the element.
   *                                if `false` is passed instead, the previously
   *                                firing function will no longer fire.
   * @chainable
   * @example
   * <div class='norender'><code>
   * let cnv;
   * let d;
   * function setup() {
   *   cnv = createCanvas(100, 100);
   *   cnv.mouseOver(changeGray);
   *   d = 10;
   * }
   *
   * function draw() {
   *   ellipse(width / 2, height / 2, d, d);
   * }
   *
   * function changeGray() {
   *   d = d + 10;
   *   if (d > 100) {
   *     d = 0;
   *   }
   * }
   * </code></div>
   *
   *
   * @alt
   * no display.
   *
   */
  def mouseOver(fxn: js.Function0[Unit] | Boolean): Element = js.native

  /**
   * The .<a href="#/p5.Element/mouseOut">mouseOut()</a> function is called once after every time a
   * mouse moves off the element. This can be used to attach an
   * element specific event listener.
   *
   * @method mouseOut
   * @param  {Function|Boolean} fxn function to be fired when a mouse
   *                                moves off of an element.
   *                                if `false` is passed instead, the previously
   *                                firing function will no longer fire.
   * @chainable
   * @example
   * <div class='norender'><code>
   * let cnv;
   * let d;
   * function setup() {
   *   cnv = createCanvas(100, 100);
   *   cnv.mouseOut(changeGray);
   *   d = 10;
   * }
   *
   * function draw() {
   *   ellipse(width / 2, height / 2, d, d);
   * }
   *
   * function changeGray() {
   *   d = d + 10;
   *   if (d > 100) {
   *     d = 0;
   *   }
   * }
   * </code></div>
   *
   * @alt
   * no display.
   *
   */
  def mouseOut(fxn: js.Function0[Unit] | Boolean): Element = js.native

  /**
   * The .<a href="#/p5.Element/touchStarted">touchStarted()</a> function is called once after every time a touch is
   * registered. This can be used to attach element specific event listeners.
   *
   * @method touchStarted
   * @param  {Function|Boolean} fxn function to be fired when a touch
   *                                starts over the element.
   *                                if `false` is passed instead, the previously
   *                                firing function will no longer fire.
   * @chainable
   * @example
   * <div class='norender'><code>
   * let cnv;
   * let d;
   * let g;
   * function setup() {
   *   cnv = createCanvas(100, 100);
   *   cnv.touchStarted(changeGray); // attach listener for
   *   // canvas click only
   *   d = 10;
   *   g = 100;
   * }
   *
   * function draw() {
   *   background(g);
   *   ellipse(width / 2, height / 2, d, d);
   * }
   *
   * // this function fires with any touch anywhere
   * function touchStarted() {
   *   d = d + 10;
   * }
   *
   * // this function fires only when cnv is clicked
   * function changeGray() {
   *   g = random(0, 255);
   * }
   * </code></div>
   *
   * @alt
   * no display.
   *
   */
  def touchStarted(fxn: js.Function0[Unit] | Boolean): Element = js.native

  /**
   * The .<a href="#/p5.Element/touchMoved">touchMoved()</a> function is called once after every time a touch move is
   * registered. This can be used to attach element specific event listeners.
   *
   * @method touchMoved
   * @param  {Function|Boolean} fxn function to be fired when a touch moves over
   *                                the element.
   *                                if `false` is passed instead, the previously
   *                                firing function will no longer fire.
   * @chainable
   * @example
   * <div class='norender'><code>
   * let cnv;
   * let g;
   * function setup() {
   *   cnv = createCanvas(100, 100);
   *   cnv.touchMoved(changeGray); // attach listener for
   *   // canvas click only
   *   g = 100;
   * }
   *
   * function draw() {
   *   background(g);
   * }
   *
   * // this function fires only when cnv is clicked
   * function changeGray() {
   *   g = random(0, 255);
   * }
   * </code></div>
   *
   * @alt
   * no display.
   *
   */
  def touchMoved(fxn: js.Function0[Unit] | Boolean): Element = js.native

  /**
   * The .<a href="#/p5.Element/touchEnded">touchEnded()</a> function is called once after every time a touch is
   * registered. This can be used to attach element specific event listeners.
   *
   * @method touchEnded
   * @param  {Function|Boolean} fxn function to be fired when a touch ends
   *                                over the element.
   *                                if `false` is passed instead, the previously
   *                                firing function will no longer fire.
   * @chainable
   * @example
   * <div class='norender'><code>
   * let cnv;
   * let d;
   * let g;
   * function setup() {
   *   cnv = createCanvas(100, 100);
   *   cnv.touchEnded(changeGray); // attach listener for
   *   // canvas click only
   *   d = 10;
   *   g = 100;
   * }
   *
   * function draw() {
   *   background(g);
   *   ellipse(width / 2, height / 2, d, d);
   * }
   *
   * // this function fires with any touch anywhere
   * function touchEnded() {
   *   d = d + 10;
   * }
   *
   * // this function fires only when cnv is clicked
   * function changeGray() {
   *   g = random(0, 255);
   * }
   * </code></div>
   *
   *
   * @alt
   * no display.
   *
   */
  def touchEnded(fxn: js.Function0[Unit] | Boolean): Element = js.native

  /**
   * The .<a href="#/p5.Element/dragOver">dragOver()</a> function is called once after every time a
   * file is dragged over the element. This can be used to attach an
   * element specific event listener.
   *
   * @method dragOver
   * @param  {Function|Boolean} fxn function to be fired when a file is
   *                                dragged over the element.
   *                                if `false` is passed instead, the previously
   *                                firing function will no longer fire.
   * @chainable
   * @example
   * <div><code>
   * // To test this sketch, simply drag a
   * // file over the canvas
   * function setup() {
   *   let c = createCanvas(100, 100);
   *   background(200);
   *   textAlign(CENTER);
   *   text('Drag file', width / 2, height / 2);
   *   c.dragOver(dragOverCallback);
   * }
   *
   * // This function will be called whenever
   * // a file is dragged over the canvas
   * function dragOverCallback() {
   *   background(240);
   *   text('Dragged over', width / 2, height / 2);
   * }
   * </code></div>
   * @alt
   * nothing displayed
   */
  def dragOver(fxn: js.Function0[Unit] | Boolean): Element = js.native

  /**
   * The .dragLeave() function is called once after every time a
   * dragged file leaves the element area. This can be used to attach an
   * element specific event listener.
   *
   * @method dragLeave
   * @param  {Function|Boolean} fxn function to be fired when a file is
   *                                dragged off the element.
   *                                if `false` is passed instead, the previously
   *                                firing function will no longer fire.
   * @chainable
   * @example
   * <div><code>
   * // To test this sketch, simply drag a file
   * // over and then out of the canvas area
   * function setup() {
   *   let c = createCanvas(100, 100);
   *   background(200);
   *   textAlign(CENTER);
   *   text('Drag file', width / 2, height / 2);
   *   c.dragLeave(dragLeaveCallback);
   * }
   *
   * // This function will be called whenever
   * // a file is dragged out of the canvas
   * function dragLeaveCallback() {
   *   background(240);
   *   text('Dragged off', width / 2, height / 2);
   * }
   * </code></div>
   * @alt
   * nothing displayed
   */
  def dragLeave(fxn: js.Function0[Unit] | Boolean): Element = js.native

}
