organization := "org.knoldus.com"

name := "Lift_Using_SBT"

version := "0.1-SNAPSHOT"

scalaVersion := "2.10.0"

seq(webSettings :_*)

libraryDependencies ++= {
val liftVersion = "2.6-M2"
Seq(
"net.liftweb" %% "lift-webkit" % liftVersion % "compile",
"org.eclipse.jetty" % "jetty-webapp" % "8.1.7.v20120910" %"container,test",
"org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" %
"container,compile" artifacts Artifact("javax.servlet", "jar", "jar")
)
}
