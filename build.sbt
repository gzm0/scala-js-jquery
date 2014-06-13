scalaJSSettings

name := "Scala.js jQuery"

normalizedName := "scalajs-jquery"

version := "0.7-SNAPSHOT"

organization := "org.scala-lang.modules.scalajs"

scalaVersion := "2.11.1"

crossScalaVersions := Seq("2.10.4", "2.11.1")

libraryDependencies +=
  "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6"

ScalaJSKeys.jsDependencies +=
  "org.webjars" % "jquery" % "1.10.2" / "jquery.js"

homepage := Some(url("http://scala-js.org/"))

licenses += ("BSD New", url("https://github.com/scala-js/scala-js/blob/master/LICENSE"))
