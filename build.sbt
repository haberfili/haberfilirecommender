name := "haberfiliRecommender"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "org.apache.lucene" % "lucene-core" % "4.9.0",
  "org.apache.lucene" % "lucene-analyzers" % "3.6.2",
  "org.apache.lucene" % "lucene-queries" % "4.9.0",
  "org.apache.lucene" % "lucene-analyzers-common" % "4.9.0",
  "org.apache.lucene" % "lucene-queryparser" % "4.9.0",
  "org.mongodb" % "mongo-java-driver" % "2.10.1",
  "com.google.code.morphia" % "morphia" % "0.104"
)

play.Project.playScalaSettings
