sonatypeProfileName := "com.gu"

ThisBuild / publishTo := sonatypePublishToBundle.value

ThisBuild / scmInfo := Some(ScmInfo(
  url("https://github.com/guardian/play-secret-rotation"),
  "scm:git:git@github.com:guardian/play-secret-rotation.git"
))

ThisBuild / pomExtra := (
  <url>https://github.com/guardian/play-secret-rotation</url>
    <developers>
      <developer>
        <id>rtyley</id>
        <name>Roberto Tyley</name>
        <url>https://github.com/rtyley</url>
      </developer>
    </developers>
  )