package p5.js.modules.core

import scala.scalajs.js

// p5.js/src/core/constants.js
@js.native
trait Constants extends js.Object {
  /**
   * @module Constants
   * @submodule Constants
   * @for p5
   */
  val _PI: Double = js.native

  // GRAPHICS RENDERER
  /**
   * The default, two-dimensional renderer.
   * @property {String} P2D
   * @final
   */
  val P2D: String = js.native
  /**
   * One of the two render modes in p5.js: P2D (default renderer) and WEBGL
   * Enables 3D render by introducing the third dimension: Z
   * @property {String} WEBGL
   * @final
   */
  val WEBGL: String = js.native

  // ENVIRONMENT
  /**
   * @property {String} ARROW
   * @final
   */
  val ARROW: String = js.native
  /**
   * @property {String} CROSS
   * @final
   */
  val CROSS: String = js.native
  /**
   * @property {String} HAND
   * @final
   */
  val HAND: String = js.native
  /**
   * @property {String} MOVE
   * @final
   */
  val MOVE: String = js.native
  /**
   * @property {String} TEXT
   * @final
   */
  val TEXT: String = js.native
  /**
   * @property {String} WAIT
   * @final
   */
  val WAIT: String = js.native

  // TRIGONOMETRY

  /**
   * HALF_PI is a mathematical constant with the value
   * 1.57079632679489661923. It is half the ratio of the
   * circumference of a circle to its diameter. It is useful in
   * combination with the trigonometric functions <a href="#/p5/sin">sin()</a> and <a href="#/p5/cos">cos()</a>.
   *
   * @property {Number} HALF_PI
   * @final
   *
   * @example
   * <div><code>
   * arc(50, 50, 80, 80, 0, HALF_PI);
   * </code></div>
   *
   * @alt
   * 80x80 white quarter-circle with curve toward bottom right of canvas.
   *
   */
  val HALF_PI = _PI / 2;
  /**
   * PI is a mathematical constant with the value
   * 3.14159265358979323846. It is the ratio of the circumference
   * of a circle to its diameter. It is useful in combination with
   * the trigonometric functions <a href="#/p5/sin">sin()</a> and <a href="#/p5/cos">cos()</a>.
   *
   * @property {Number} PI
   * @final
   *
   * @example
   * <div><code>
   * arc(50, 50, 80, 80, 0, PI);
   * </code></div>
   *
   * @alt
   * white half-circle with curve toward bottom of canvas.
   *
   */
  val PI = _PI;
  /**
   * QUARTER_PI is a mathematical constant with the value 0.7853982.
   * It is one quarter the ratio of the circumference of a circle to
   * its diameter. It is useful in combination with the trigonometric
   * functions <a href="#/p5/sin">sin()</a> and <a href="#/p5/cos">cos()</a>.
   *
   * @property {Number} QUARTER_PI
   * @final
   *
   * @example
   * <div><code>
   * arc(50, 50, 80, 80, 0, QUARTER_PI);
   * </code></div>
   *
   * @alt
   * white eighth-circle rotated about 40 degrees with curve bottom right canvas.
   *
   */
  val QUARTER_PI: Double = js.native
  /**
   * TAU is an alias for TWO_PI, a mathematical constant with the
   * value 6.28318530717958647693. It is twice the ratio of the
   * circumference of a circle to its diameter. It is useful in
   * combination with the trigonometric functions <a href="#/p5/sin">sin()</a> and <a href="#/p5/cos">cos()</a>.
   *
   * @property {Number} TAU
   * @final
   *
   * @example
   * <div><code>
   * arc(50, 50, 80, 80, 0, TAU);
   * </code></div>
   *
   * @alt
   * 80x80 white ellipse shape in center of canvas.
   *
   */
  val TAU: Double = js.native
  /**
   * TWO_PI is a mathematical constant with the value
   * 6.28318530717958647693. It is twice the ratio of the
   * circumference of a circle to its diameter. It is useful in
   * combination with the trigonometric functions <a href="#/p5/sin">sin()</a> and <a href="#/p5/cos">cos()</a>.
   *
   * @property {Number} TWO_PI
   * @final
   *
   * @example
   * <div><code>
   * arc(50, 50, 80, 80, 0, TWO_PI);
   * </code></div>
   *
   * @alt
   * 80x80 white ellipse shape in center of canvas.
   *
   */
  val TWO_PI: Double = js.native
  /**
   * Constant to be used with <a href="#/p5/angleMode">angleMode()</a> function, to set the mode which
   * p5.js interprates and calculates angles (either DEGREES or RADIANS).
   * @property {String} DEGREES
   * @final
   *
   * @example
   * <div class='norender'><code>
   * function setup() {
   *   angleMode(DEGREES);
   * }
   * </code></div>
   */
  val DEGREES: String = js.native
  /**
   * Constant to be used with <a href="#/p5/angleMode">angleMode()</a> function, to set the mode which
   * p5.js interprates and calculates angles (either RADIANS or DEGREES).
   * @property {String} RADIANS
   * @final
   *
   * @example
   * <div class='norender'><code>
   * function setup() {
   *   angleMode(RADIANS);
   * }
   * </code></div>
   */
  val RADIANS: String = js.native
  val DEG_TO_RAD: Double = js.native
  val RAD_TO_DEG: Double = js.native

  // SHAPE
  /**
   * @property {String} CORNER
   * @final
   */
  val CORNER: String = js.native
  /**
   * @property {String} CORNERS
   * @final
   */
  val CORNERS: String = js.native
  /**
   * @property {String} RADIUS
   * @final
   */
  val RADIUS: String = js.native
  /**
   * @property {String} RIGHT
   * @final
   */
  val RIGHT: String = js.native
  /**
   * @property {String} LEFT
   * @final
   */
  val LEFT: String = js.native
  /**
   * @property {String} CENTER
   * @final
   */
  val CENTER: String = js.native
  /**
   * @property {String} TOP
   * @final
   */
  val TOP: String = js.native
  /**
   * @property {String} BOTTOM
   * @final
   */
  val BOTTOM: String = js.native
  /**
   * @property {String} BASELINE
   * @final
   * @default alphabetic
   */
  val BASELINE: String = js.native
  /**
   * @property {Number} POINTS
   * @final
   * @default 0x0000
   */
  val POINTS: Byte = js.native
  /**
   * @property {Number} LINES
   * @final
   * @default 0x0001
   */
  val LINES: Byte = js.native
  /**
   * @property {Number} LINE_STRIP
   * @final
   * @default 0x0003
   */
  val LINE_STRIP: Byte = js.native
  /**
   * @property {Number} LINE_LOOP
   * @final
   * @default 0x0002
   */
  val LINE_LOOP: Byte = js.native
  /**
   * @property {Number} TRIANGLES
   * @final
   * @default 0x0004
   */
  val TRIANGLES: Byte = js.native
  /**
   * @property {Number} TRIANGLE_FAN
   * @final
   * @default 0x0006
   */
  val TRIANGLE_FAN: Byte = js.native
  /**
   * @property {Number} TRIANGLE_STRIP
   * @final
   * @default 0x0005
   */
  val TRIANGLE_STRIP: Byte = js.native
  /**
   * @property {String} QUADS
   * @final
   */
  val QUADS: String = js.native
  /**
   * @property {String} QUAD_STRIP
   * @final
   * @default quad_strip
   */
  val QUAD_STRIP: String = js.native
  /**
   * @property {String} TESS
   * @final
   * @default tess
   */
  val TESS: String = js.native
  /**
   * @property {String} CLOSE
   * @final
   */
  val CLOSE: String = js.native
  /**
   * @property {String} OPEN
   * @final
   */
  val OPEN: String = js.native
  /**
   * @property {String} CHORD
   * @final
   */
  val CHORD: String = js.native
  /**
   * @property {String} PIE
   * @final
   */
  val PIE: String = js.native
  /**
   * @property {String} PROJECT
   * @final
   * @default square
   */
  val PROJECT: String = js.native
  /**
   * @property {String} SQUARE
   * @final
   * @default butt
   */
  val SQUARE: String = js.native
  /**
   * @property {String} ROUND
   * @final
   */
  val ROUND: String = js.native
  /**
   * @property {String} BEVEL
   * @final
   */
  val BEVEL: String = js.native
  /**
   * @property {String} MITER
   * @final
   */
  val MITER: String = js.native

  // COLOR
  /**
   * @property {String} RGB
   * @final
   */
  val RGB: String = js.native
  /**
   * @property {String} HSB
   * @final
   */
  val HSB: String = js.native
  /**
   * @property {String} HSL
   * @final
   */
  val HSL: String = js.native

  // DOM EXTENSION
  /**
   * AUTO allows us to automatically set the width or height of an element (but not both),
   * based on the current height and width of the element. Only one parameter can
   * be passed to the <a href="/#/p5.Element/size">size</a> function as AUTO, at a time.
   *
   * @property {String} AUTO
   * @final
   */
  val AUTO: String = js.native

  /**
   * @property {Number} ALT
   * @final
   */
  // INPUT
  val ALT: Int = js.native
  /**
   * @property {Number} BACKSPACE
   * @final
   */
  val BACKSPACE: Int = js.native
  /**
   * @property {Number} CONTROL
   * @final
   */
  val CONTROL: Int = js.native
  /**
   * @property {Number} DELETE
   * @final
   */
  val DELETE: Int = js.native
  /**
   * @property {Number} DOWN_ARROW
   * @final
   */
  val DOWN_ARROW: Int = js.native
  /**
   * @property {Number} ENTER
   * @final
   */
  val ENTER: Int = js.native
  /**
   * @property {Number} ESCAPE
   * @final
   */
  val ESCAPE: Int = js.native
  /**
   * @property {Number} LEFT_ARROW
   * @final
   */
  val LEFT_ARROW: Int = js.native
  /**
   * @property {Number} OPTION
   * @final
   */
  val OPTION: Int = js.native
  /**
   * @property {Number} RETURN
   * @final
   */
  val RETURN: Int = js.native
  /**
   * @property {Number} RIGHT_ARROW
   * @final
   */
  val RIGHT_ARROW: Int = js.native
  /**
   * @property {Number} SHIFT
   * @final
   */
  val SHIFT: Int = js.native
  /**
   * @property {Number} TAB
   * @final
   */
  val TAB: Int = js.native
  /**
   * @property {Number} UP_ARROW
   * @final
   */
  val UP_ARROW: Int = js.native

  // RENDERING
  /**
   * @property {String} BLEND
   * @final
   * @default source-over
   */
  val BLEND: String = js.native
  /**
   * @property {String} REMOVE
   * @final
   * @default destination-out
   */
  val REMOVE: String = js.native
  /**
   * @property {String} ADD
   * @final
   * @default lighter
   */
  val ADD: String = js.native
  //ADD: 'add', //
  //SUBTRACT: 'subtract', //
  /**
   * @property {String} DARKEST
   * @final
   */
  val DARKEST: String = js.native
  /**
   * @property {String} LIGHTEST
   * @final
   * @default lighten
   */
  val LIGHTEST: String = js.native
  /**
   * @property {String} DIFFERENCE
   * @final
   */
  val DIFFERENCE: String = js.native
  /**
   * @property {String} SUBTRACT
   * @final
   */
  val SUBTRACT: String = js.native
  /**
   * @property {String} EXCLUSION
   * @final
   */
  val EXCLUSION: String = js.native
  /**
   * @property {String} MULTIPLY
   * @final
   */
  val MULTIPLY: String = js.native
  /**
   * @property {String} SCREEN
   * @final
   */
  val SCREEN: String = js.native
  /**
   * @property {String} REPLACE
   * @final
   * @default copy
   */
  val REPLACE: String = js.native
  /**
   * @property {String} OVERLAY
   * @final
   */
  val OVERLAY: String = js.native
  /**
   * @property {String} HARD_LIGHT
   * @final
   */
  val HARD_LIGHT: String = js.native
  /**
   * @property {String} SOFT_LIGHT
   * @final
   */
  val SOFT_LIGHT: String = js.native
  /**
   * @property {String} DODGE
   * @final
   * @default color-dodge
   */
  val DODGE: String = js.native
  /**
   * @property {String} BURN
   * @final
   * @default color-burn
   */
  val BURN: String = js.native

  // FILTERS
  /**
   * @property {String} THRESHOLD
   * @final
   */
  val THRESHOLD: String = js.native
  /**
   * @property {String} GRAY
   * @final
   */
  val GRAY: String = js.native
  /**
   * @property {String} OPAQUE
   * @final
   */
  val OPAQUE: String = js.native
  /**
   * @property {String} INVERT
   * @final
   */
  val INVERT: String = js.native
  /**
   * @property {String} POSTERIZE
   * @final
   */
  val POSTERIZE: String = js.native
  /**
   * @property {String} DILATE
   * @final
   */
  val DILATE: String = js.native
  /**
   * @property {String} ERODE
   * @final
   */
  val ERODE: String = js.native
  /**
   * @property {String} BLUR
   * @final
   */
  val BLUR: String = js.native

  // TYPOGRAPHY
  /**
   * @property {String} NORMAL
   * @final
   */
  val NORMAL: String = js.native
  /**
   * @property {String} ITALIC
   * @final
   */
  val ITALIC: String = js.native
  /**
   * @property {String} BOLD
   * @final
   */
  val BOLD: String = js.native
  /**
   * @property {String} BOLDITALIC
   * @final
   */
  val BOLDITALIC: String = js.native

  // TYPOGRAPHY-INTERNAL
  val _DEFAULT_TEXT_FILL: String = js.native
  val _DEFAULT_LEADMULT = 1.25;
  val _CTX_MIDDLE: String = js.native

  // VERTICES
  /**
   * @property {String} LINEAR
   * @final
   */
  val LINEAR: String = js.native
  /**
   * @property {String} QUADRATIC
   * @final
   */
  val QUADRATIC: String = js.native
  /**
   * @property {String} BEZIER
   * @final
   */
  val BEZIER: String = js.native
  /**
   * @property {String} CURVE
   * @final
   */
  val CURVE: String = js.native

  // WEBGL DRAWMODES
  /**
   * @property {String} STROKE
   * @final
   */
  val STROKE: String = js.native
  /**
   * @property {String} FILL
   * @final
   */
  val FILL: String = js.native
  /**
   * @property {String} TEXTURE
   * @final
   */
  val TEXTURE: String = js.native
  /**
   * @property {String} IMMEDIATE
   * @final
   */
  val IMMEDIATE: String = js.native

  // WEBGL TEXTURE MODE
  // NORMAL already exists for typography
  /**
   * @property {String} IMAGE
   * @final
   */
  val IMAGE: String = js.native

  // WEBGL TEXTURE WRAP AND FILTERING
  // LINEAR already exists above
  /**
   * @property {String} NEAREST
   * @final
   */
  val NEAREST: String = js.native
  /**
   * @property {String} REPEAT
   * @final
   */
  val REPEAT: String = js.native
  /**
   * @property {String} CLAMP
   * @final
   */
  val CLAMP: String = js.native
  /**
   * @property {String} MIRROR
   * @final
   */
  val MIRROR: String = js.native

  // DEVICE-ORIENTATION
  /**
   * @property {String} LANDSCAPE
   * @final
   */
  val LANDSCAPE: String = js.native
  /**
   * @property {String} PORTRAIT
   * @final
   */
  val PORTRAIT: String = js.native

  // DEFAULTS
  val _DEFAULT_STROKE: String = js.native
  val _DEFAULT_FILL: String = js.native

  /**
   * @property {String} GRID
   * @final
   */
  val GRID: String = js.native

  /**
   * @property {String} AXES
   * @final
   */
  val AXES: String = js.native


}
