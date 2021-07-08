name := "playproject"

version := "1.0-SNAPSHOT"


lazy val `playproject` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"

scalaVersion := "2.13.5"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )

/**to establish mysql database connection*/
libraryDependencies ++= Seq(
  jdbc
)
libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.41"
)
