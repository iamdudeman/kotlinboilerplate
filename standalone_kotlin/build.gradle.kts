val implementationTitle = "Gradle Jar File Example"
val implementationVersion = 1
val mainClass = "test.HelloWorldKt"
val kotlinVersion = "1.2.41"
val dokkaVersion = "0.9.16"
val junitVersion = "4.12"

plugins {
  application
  idea
  kotlin("jvm") version "1.2.41"
  id("org.jetbrains.dokka") version "0.9.16"
}

application {
  mainClassName = mainClass
}

dependencies {
  compile(kotlin("stdlib"))
  compile("org.jetbrains.dokka:dokka-gradle-plugin:0.9.16")
  testCompile("junit:junit:4.12")
  testCompile("org.jetbrains.kotlin:kotlin-test-junit:1.2.41")
}

repositories {
  jcenter()
}

val fatJar = task("fatJar", type = Jar::class) {
  baseName = "${project.name}-fat"
  manifest {
    attributes["Implementation-Title"] = implementationTitle
    attributes["Implementation-Version"] = implementationVersion
    attributes["Main-Class"] = mainClass
  }
  from(configurations.runtime.map({ if (it.isDirectory) it else zipTree(it) }))
  with(tasks["jar"] as CopySpec)
}

java.setSourceCompatibility(1.8)
java.setTargetCompatibility(1.8)

idea.project.vcs = "Git"
idea.project.jdkName = "1.8"
idea.project.setLanguageLevel("1.8")
idea.module.isDownloadJavadoc = true
idea.module.isDownloadSources = false

tasks {
  "build" {
    dependsOn(fatJar)
  }

  "docs" {
    dependsOn("dokka", "dokkaJavadoc")
  }

  "dokka"(org.jetbrains.dokka.gradle.DokkaTask::class) {
    outputDirectory = "$buildDir/docs/kotlin"
  }

  "dokkaJavadoc"(org.jetbrains.dokka.gradle.DokkaTask::class) {
    outputFormat = "html-as-java"
    outputDirectory = "$buildDir/docs/java"
  }
}

