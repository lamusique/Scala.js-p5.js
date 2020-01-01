package p5.js.modules.core

import _root_.p5.js.p5

import scala.scalajs.js

// p5.js/src/core/environment.js
@js.native
trait Environment extends js.Object {

//  /**
//   * @module Environment
//   * @submodule Environment
//   * @for p5
//   * @requires core
//   * @requires constants
//   */
//
//  import p5 from './main';
//  import * as C from './constants';


  /**
   * The <a href="#/p5/print">print()</a> function writes to the console area of your browser.
   * This function is often helpful for looking at the data a program is
   * producing. This function creates a new line of text for each call to
   * the function. Individual elements can be
   * separated with quotes ("") and joined with the addition operator (+).
   *
   * Note that calling print() without any arguments invokes the window.print()
   * function which opens the browser's print dialog. To print a blank line
   * to console you can write print('\n').
   *
   * @method print
   * @param {Any} contents any combination of Number, String, Object, Boolean,
   *                       Array to print
   * @example
   * <div><code class='norender'>
   * let x = 10;
   * print('The value of x is ' + x);
   * // prints "The value of x is 10"
   * </code></div>
   * @alt
   * default grey canvas
   */
  def print(contents: js.Any): Unit = js.native

  /**
   * The system variable <a href="#/p5/frameCount">frameCount</a> contains the number of frames that have
   * been displayed since the program started. Inside <a href="#/p5/setup">setup()</a> the value is 0,
   * after the first iteration of draw it is 1, etc.
   *
   * @property {Integer} frameCount
   * @readOnly
   * @example
   *   <div><code>
   * function setup() {
   *   frameRate(30);
   *   textSize(30);
   *   textAlign(CENTER);
   * }
   *
   * function draw() {
   *   background(200);
   *   text(frameCount, width / 2, height / 2);
   * }
</code></div>
   *
   * @alt
   * numbers rapidly counting upward with frame count set to 30.
   *
   */
  var frameCount: Double = js.native

  /**
   * The system variable <a href="#/p5/deltaTime">deltaTime</a> contains the time
   * difference between the beginning of the previous frame and the beginning
   * of the current frame in milliseconds.
   * <br><br>
   * This variable is useful for creating time sensitive animation or physics
   * calculation that should stay constant regardless of frame rate.
   *
   * @property {Integer} deltaTime
   * @readOnly
   * @example
   * <div><code>
   * let rectX = 0;
   * let fr = 30; //starting FPS
   * let clr;
   *
   * function setup() {
   *   background(200);
   *   frameRate(fr); // Attempt to refresh at starting FPS
   *   clr = color(255, 0, 0);
   * }
   *
   * function draw() {
   *   background(200);
   *   rectX = rectX + 1 * (deltaTime / 50); // Move Rectangle in relation to deltaTime
   *
   *   if (rectX >= width) {
   *     // If you go off screen.
   *     if (fr === 30) {
   *       clr = color(0, 0, 255);
   *       fr = 10;
   *       frameRate(fr); // make frameRate 10 FPS
   *     } else {
   *       clr = color(255, 0, 0);
   *       fr = 30;
   *       frameRate(fr); // make frameRate 30 FPS
   *     }
   *     rectX = 0;
   *   }
   *   fill(clr);
   *   rect(rectX, 40, 20, 20);
   * }
   * </code></div>
   *
   * @alt
   * red rect moves left to right, followed by blue rect moving at the same speed
   * with a lower frame rate. Loops.
   *
   */
  var deltaTime: Double = js.native

  /**
   * Confirms if the window a p5.js program is in is "focused," meaning that
   * the sketch will accept mouse or keyboard input. This variable is
   * "true" if the window is focused and "false" if not.
   *
   * @property {Boolean} focused
   * @readOnly
   * @example
   * <div><code>
   * // To demonstrate, put two windows side by side.
   * // Click on the window that the p5 sketch isn't in!
   * function draw() {
   *   background(200);
   *   noStroke();
   *   fill(0, 200, 0);
   *   ellipse(25, 25, 50, 50);
   *
   *   if (!focused) {
    // or "if (focused === false)"
   *     stroke(200, 0, 0);
   *     line(0, 0, 100, 100);
   *     line(100, 0, 0, 100);
   *   }
   * }
   * </code></div>
   *
   * @alt
   * green 50x50 ellipse at top left. Red X covers canvas when page focus changes
   *
   */
  var focused: Boolean = js.native

  /**
   * Sets the cursor to a predefined symbol or an image, or makes it visible
   * if already hidden. If you are trying to set an image as the cursor, the
   * recommended size is 16x16 or 32x32 pixels. The values for parameters x and y
   * must be less than the dimensions of the image.
   *
   * @method cursor
   * @param {String|Constant} type Built-In: either ARROW, CROSS, HAND, MOVE, TEXT and WAIT
   *                               Native CSS properties: 'grab', 'progress', 'cell' etc.
   *                               External: path for cursor's images
   *                               (Allowed File extensions: .cur, .gif, .jpg, .jpeg, .png)
   *                               For more information on Native CSS cursors and url visit:
   *                               https://developer.mozilla.org/en-US/docs/Web/CSS/cursor
   * @param {Number}          [x]  the horizontal active spot of the cursor (must be less than 32)
   * @param {Number}          [y]  the vertical active spot of the cursor (must be less than 32)
   * @example
   * <div><code>
   * // Move the mouse across the quadrants
   * // to see the cursor change
   * function draw() {
   *   line(width / 2, 0, width / 2, height);
   *   line(0, height / 2, width, height / 2);
   *   if (mouseX < 50 && mouseY < 50) {
   *     cursor(CROSS);
   *   } else if (mouseX > 50 && mouseY < 50) {
   *     cursor('progress');
   *   } else if (mouseX > 50 && mouseY > 50) {
   *     cursor('https://s3.amazonaws.com/mupublicdata/cursor.cur');
   *   } else {
   *     cursor('grab');
   *   }
   * }
   * </code></div>
   *
   * @alt
   * canvas is divided into four quadrants. cursor on first is a cross, second is a progress,
   * third is a custom cursor using path to the cursor and fourth is a grab.
   *
   */
  def cursor(`type`: String, x: js.UndefOr[Int] = js.undefined, y: js.UndefOr[Int] = js.undefined): Unit = js.native
  // https://developer.mozilla.org/en-US/docs/Web/CSS/cursor

  /**
   * Specifies the number of frames to be displayed every second. For example,
   * the function call frameRate(30) will attempt to refresh 30 times a second.
   * If the processor is not fast enough to maintain the specified rate, the
   * frame rate will not be achieved. Setting the frame rate within <a href="#/p5/setup">setup()</a> is
   * recommended. The default frame rate is based on the frame rate of the display
   * (here also called "refresh rate"), which is set to 60 frames per second on most
   * computers. A frame rate of 24 frames per second (usual for movies) or above
   * will be enough for smooth animations
   * This is the same as setFrameRate(val).
   * <br><br>
   * Calling <a href="#/p5/frameRate">frameRate()</a> with no arguments returns the current framerate. The
   * draw function must run at least once before it will return a value. This
   * is the same as <a href="#/p5/getFrameRate">getFrameRate()</a>.
   * <br><br>
   * Calling <a href="#/p5/frameRate">frameRate()</a> with arguments that are not of the type numbers
   * or are non positive also returns current framerate.
   *
   * @method frameRate
   * @param  {Number} fps number of frames to be displayed every second
   * @chainable
   *
   * @example
   *
   * <div><code>
   * let rectX = 0;
   * let fr = 30; //starting FPS
   * let clr;
   *
   * function setup() {
   *   background(200);
   *   frameRate(fr); // Attempt to refresh at starting FPS
   *   clr = color(255, 0, 0);
   * }
   *
   * function draw() {
   *   background(200);
   *   rectX = rectX += 1; // Move Rectangle
   *
   *   if (rectX >= width) {
    // If you go off screen.
   *     if (fr === 30) {
   *       clr = color(0, 0, 255);
   *       fr = 10;
   *       frameRate(fr); // make frameRate 10 FPS
   *     } else {
   *       clr = color(255, 0, 0);
   *       fr = 30;
   *       frameRate(fr); // make frameRate 30 FPS
   *     }
   *     rectX = 0;
   *   }
   *   fill(clr);
   *   rect(rectX, 40, 20, 20);
   * }
   * </code></div>
   *
   * @alt
   * blue rect moves left to right, followed by red rect moving faster. Loops.
   *
   */
  /**
   * @method frameRate
   * @return {Number}       current frameRate
   */
  def frameRate(fps: Double): p5 = js.native
  def frameRate(): Double = js.native

  /**
   * Returns the current framerate.
   *
   * @private
   * @return {Number} current frameRate
   */
    // the same as frameRate()
//  def getFrameRate(): Int = js.native

  /**
   * Specifies the number of frames to be displayed every second. For example,
   * the function call frameRate(30) will attempt to refresh 30 times a second.
   * If the processor is not fast enough to maintain the specified rate, the
   * frame rate will not be achieved. Setting the frame rate within <a href="#/p5/setup">setup()</a> is
   * recommended. The default rate is 60 frames per second.
   *
   * Calling <a href="#/p5/frameRate">frameRate()</a> with no arguments returns the current framerate.
   *
   * @private
   * @param {Number} [fps] number of frames to be displayed every second
   */
  // the same as frameRate()
//  def setFrameRate(fps: Int): Unit = js.native

  /**
   * Hides the cursor from view.
   *
   * @method noCursor
   * @example
   * <div><code>
   * function setup() {
   *   noCursor();
   * }
   *
   * function draw() {
   *   background(200);
   *   ellipse(mouseX, mouseY, 10, 10);
   * }
   * </code></div>
   *
   *
   * @alt
   * cursor becomes 10x 10 white ellipse the moves with mouse x and y.
   *
   */
  def noCursor(): Unit = js.native

  /**
   * System variable that stores the width of the screen display according to The
   * default <a href="#/p5/pixelDensity">pixelDensity</a>. This is used to run a
   * full-screen program on any display size. To return actual screen size,
   * multiply this by pixelDensity.
   *
   * @property {Number} displayWidth
   * @readOnly
   * @example
   * <div class="norender"><code>
   * createCanvas(displayWidth, displayHeight);
   * </code></div>
   *
   * @alt
   * cursor becomes 10x 10 white ellipse the moves with mouse x and y.
   *
   */
  var displayWidth: Int = js.native

  /**
   * System variable that stores the height of the screen display according to The
   * default <a href="#/p5/pixelDensity">pixelDensity</a>. This is used to run a
   * full-screen program on any display size. To return actual screen size,
   * multiply this by pixelDensity.
   *
   * @property {Number} displayHeight
   * @readOnly
   * @example
   * <div class="norender"><code>
   * createCanvas(displayWidth, displayHeight);
   * </code></div>
   *
   * @alt
   * no display.
   *
   */
  var displayHeight: Int = js.native

  /**
   * System variable that stores the width of the inner window, it maps to
   * window.innerWidth.
   *
   * @property {Number} windowWidth
   * @readOnly
   * @example
   * <div class="norender"><code>
   * createCanvas(windowWidth, windowHeight);
   * </code></div>
   *
   * @alt
   * no display.
   *
   */
  var windowWidth: Int = js.native

  /**
   * System variable that stores the height of the inner window, it maps to
   * window.innerHeight.
   *
   * @property {Number} windowHeight
   * @readOnly
   * @example
   * <div class="norender"><code>
   * createCanvas(windowWidth, windowHeight);
   * </code></div>
   *@alt
   * no display.
   *
   */
  var windowHeight: Int = js.native

  /**
   * The <a href="#/p5/windowResized">windowResized()</a> function is called once every time the browser window
   * is resized. This is a good place to resize the canvas or do any other
   * adjustments to accommodate the new window size.
   *
   * @method windowResized
   * @example
   * <div class="norender"><code>
   * function setup() {
   *   createCanvas(windowWidth, windowHeight);
   * }
   *
   * function draw() {
   *   background(0, 100, 200);
   * }
   *
   * function windowResized() {
   *   resizeCanvas(windowWidth, windowHeight);
   * }
   * </code></div>
   * @alt
   * no display.
   */
  var windowResized: js.Function0[Unit] = js.native

  /**
   * System variable that stores the width of the drawing canvas. This value
   * is set by the first parameter of the <a href="#/p5/createCanvas">createCanvas()</a> function.
   * For example, the function call createCanvas(320, 240) sets the width
   * variable to the value 320. The value of width defaults to 100 if
   * <a href="#/p5/createCanvas">createCanvas()</a> is not used in a program.
   *
   * @property {Number} width
   * @readOnly
   */
  var width: Int = js.native

  /**
   * System variable that stores the height of the drawing canvas. This value
   * is set by the second parameter of the <a href="#/p5/createCanvas">createCanvas()</a> function. For
   * example, the function call createCanvas(320, 240) sets the height
   * variable to the value 240. The value of height defaults to 100 if
   * <a href="#/p5/createCanvas">createCanvas()</a> is not used in a program.
   *
   * @property {Number} height
   * @readOnly
   */
  var height: Int = js.native

  /**
   * If argument is given, sets the sketch to fullscreen or not based on the
   * value of the argument. If no argument is given, returns the current
   * fullscreen state. Note that due to browser restrictions this can only
   * be called on user input, for example, on mouse press like the example
   * below.
   *
   * @method fullscreen
   * @param  {Boolean} [val] whether the sketch should be in fullscreen mode
   * or not
   * @return {Boolean} current fullscreen state
   * @example
   * <div>
   * <code>
   * // Clicking in the box toggles fullscreen on and off.
   * function setup() {
   *   background(200);
   * }
   * function mousePressed() {
   *   if (mouseX > 0 && mouseX < 100 && mouseY > 0 && mouseY < 100) {
   *     let fs = fullscreen();
   *     fullscreen(!fs);
   *   }
   * }
   * </code>
   * </div>
   *
   * @alt
   * no display.
   *
   */
  def fullscreen(`val`: Boolean): Unit = js.native
  // Whether it returns a Promise is undefined hinging on browsers.

  def fullscreen(): Boolean = js.native

  /**
   * Sets the pixel scaling for high pixel density displays. By default
   * pixel density is set to match display density, call pixelDensity(1)
   * to turn this off. Calling <a href="#/p5/pixelDensity">pixelDensity()</a> with no arguments returns
   * the current pixel density of the sketch.
   *
   * @method pixelDensity
   * @param  {Number} val whether or how much the sketch should scale
   * @chainable
   * @example
   * <div>
   * <code>
   * function setup() {
   *   pixelDensity(1);
   *   createCanvas(100, 100);
   *   background(200);
   *   ellipse(width / 2, height / 2, 50, 50);
   * }
   * </code>
   * </div>
   * <div>
   * <code>
   * function setup() {
   *   pixelDensity(3.0);
   *   createCanvas(100, 100);
   *   background(200);
   *   ellipse(width / 2, height / 2, 50, 50);
   * }
   * </code>
   * </div>
   *
   * @alt
   * fuzzy 50x50 white ellipse with black outline in center of canvas.
   * sharp 50x50 white ellipse with black outline in center of canvas.
   */
  /**
   * @method pixelDensity
   * @returns {Number} current pixel density of the sketch
   */
  def pixelDensity(`val`: Double): Unit = js.native
  def pixelDensity(): Double = js.native

  /**
   * Returns the pixel density of the current display the sketch is running on.
   *
   * @method displayDensity
   * @returns {Number} current pixel density of the display
   * @example
   * <div>
   * <code>
   * function setup() {
   *   let density = displayDensity();
   *   pixelDensity(density);
   *   createCanvas(100, 100);
   *   background(200);
   *   ellipse(width / 2, height / 2, 50, 50);
   * }
   * </code>
   * </div>
   *
   * @alt
   * 50x50 white ellipse with black outline in center of canvas.
   */
  def displayDensity(): Double = js.native

  /**
   * Gets the current URL.
   * @method getURL
   * @return {String} url
   * @example
   * <div>
   * <code>
   * let url;
   * let x = 100;
   *
   * function setup() {
   *   fill(0);
   *   noStroke();
   *   url = getURL();
   * }
   *
   * function draw() {
   *   background(200);
   *   text(url, x, height / 2);
   *   x--;
   * }
   * </code>
   * </div>
   *
   * @alt
   * current url (http://p5js.org/reference/#/p5/getURL) moves right to left.
   *
   */
  def getURL(): String = js.native

  /**
   * Gets the current URL path as an array.
   * @method getURLPath
   * @return {String[]} path components
   * @example
   * <div class='norender'><code>
   * function setup() {
   *   let urlPath = getURLPath();
   *   for (let i = 0; i < urlPath.length; i++) {
   *     text(urlPath[i], 10, i * 20 + 20);
   *   }
   * }
   * </code></div>
   *
   * @alt
   *no display
   *
   */
  def getURLPath(): String = js.native

  /**
   * Gets the current URL params as an Object.
   * @method getURLParams
   * @return {Object} URL params
   * @example
   * <div class='norender notest'>
   * <code>
   * // Example: http://p5js.org?year=2014&month=May&day=15
   *
   * function setup() {
   *   let params = getURLParams();
   *   text(params.day, 10, 20);
   *   text(params.month, 10, 40);
   *   text(params.year, 10, 60);
   * }
   * </code>
   * </div>
   * @alt
   * no display.
   *
   */
  def getURLParams(): String = js.native

}
