ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.6"

name := "intellijtest"

val cpgVersion = "1.3.461"

libraryDependencies ++= Seq(
  "io.shiftleft" %% "codepropertygraph" % cpgVersion,
  "io.shiftleft" %% "codepropertygraph-protos" % cpgVersion,
  "io.shiftleft" %% "semanticcpg" % cpgVersion,
)
