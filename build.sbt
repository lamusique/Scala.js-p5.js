import Dependencies._

ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.0.1"
ThisBuild / organization     := "org.p5js"
ThisBuild / organizationName := "p5.js"


enablePlugins(ScalaJSPlugin)

// This is an application with a main method
//scalaJSUseMainModuleInitializer := true
//mainClass in (Compile, run) := Some("samples.TutorialP5jsApp")
//mainClass in Compile := Some("samples.TutorialP5jsApp")

lazy val root = (project in file("."))
  .settings(
    name := "scala-js-p5js",
//    libraryDependencies += scalajsDom,
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.8",
    libraryDependencies += scalaTest % Test
  )



// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
