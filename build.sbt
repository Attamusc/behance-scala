name := """behance-scala"""

version := "1.0"

scalaVersion := "2.10.3"

resolvers += "spray" at "http://repo.spray.io/"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-simple" % "1.7.5",
  "net.databinder.dispatch" %% "dispatch-core" % "0.11.0",
  "io.spray" %%  "spray-json" % "1.2.5",
  "org.scalatest" %% "scalatest" % "2.0" % "test"
)
