name := """play4jpa"""

version := "2.4.11"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  javaJpa,
  filters,
  "org.hibernate" % "hibernate-entitymanager" % "4.3.11.Final"
)
