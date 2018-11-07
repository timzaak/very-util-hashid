name := "very-util-hashid"

version := "1.0"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "org.picoworks" %% "pico-hashids"  % "4.4.141",
  "org.scalatest" %% "scalatest" % "3.0.5" % Test
)
