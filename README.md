# kotlinboilerplate
A boilerplate for Kotlin, the Kotlin Gradle DSL, and Java 10. Includes docs tasks for both Kotlin and Java docs.

# TODO
* Cleanup example src a bit
* Apply editorconfig to all files
* Polish readme

# kotlin_project

Has a simple math class that can be used by other Kotlin prject or a pure Java project.

Tasks
```
gradle idea      # Generate the idea project
gradle test      # Run unit tests
gradle fatJar    # Create a fat jar
gradle docs      # Create javadocs and kotlin docs
```


# java_project

Uses the simple math class from Kotlin.

Tasks
```
gradle idea      # Generate the idea project
gradle test      # Run unit tests
```