organization := "org.moscatocms"

name := "blog-plugin"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.7"

scalacOptions += "-deprecation"

libraryDependencies ++= Seq(
  "org.moscatocms" %% "moscato" % "1.0.0-SNAPSHOT",
  "com.h2database" % "h2" % "1.4.187"
)

//moscatoDbUrl := "jdbc:postgresql:moscato"

//moscatoDbDriver := "org.postgresql.Driver"

//moscatoDbUsername := "moscato"

//moscatoDbPassword := "moscato"

Revolver.settings

mainClass in Revolver.reStart := Some("org.moscatocms.Boot")

lazy val root = (project in file(".")).enablePlugins(MoscatoDoctypePlugin)
