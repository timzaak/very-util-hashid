name := "very-util-hashid"

version := "1.0.0"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "com.dispalt" %% "pico-hashids"  % "4.5.153",
  "org.scalatest" %% "scalatest" % "3.2.8" % Test
)
