lazy val plain2 = (project in file("plain2"))
  .settings(
    scalaVersion := "2.13.12",
    libraryDependencies += compilerPlugin("org.augustjune" %% "context-applied" % "0.1.4"),
  )
