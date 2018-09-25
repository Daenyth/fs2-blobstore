name := "core"


libraryDependencies ++= Seq(
  "co.fs2" %% "fs2-core" % "1.0.0-M5",
  "co.fs2" %% "fs2-io" % "1.0.0-M5",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test",
  "org.typelevel" %% "cats-effect-laws" % "1.0.0" % "test"
)

scalacOptions += "-Ypartial-unification"
