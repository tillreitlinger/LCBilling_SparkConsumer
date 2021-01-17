name := "SparkConsumer"

version := "0.1"

scalaVersion := "2.12.12"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.2"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2" % "test"

libraryDependencies += "org.apache.spark" % "spark-core_2.12" % "3.0.1"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.12" % "3.0.1"
libraryDependencies += "org.apache.spark" % "spark-streaming-kafka-0-10_2.12" % "3.0.1"
libraryDependencies += "org.apache.spark" % "spark-sql_2.12" % "3.0.1"

libraryDependencies += "org.apache.kafka" %% "kafka" % "2.6.0"

libraryDependencies += "com.typesafe" % "config" % "1.2.0"
