name := "EventsProcessor"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.0"


libraryDependencies += "com.holdenkarau" %% "spark-testing-base" % "1.6.0_0.3.1"
parallelExecution in Test := false

libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka" % "2.2.0"

