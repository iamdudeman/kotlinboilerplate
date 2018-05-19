# kotlinboilerplate
A boilerplate for Kotlin, the Kotlin Gradle DSL, and Java 10. Includes a docs task that generates docs both Kotlin and Java.
kotlin_project is the main boilerplate project starter. 
java_project was included to show how easy it is to use a Kotlin library in Java while also having access to JavaDocs.


## kotlin_project

Has a SimpleMath class and a main method that prints out a greeting. Has some tests for each.

Tasks
```
gradle idea      # Generate the idea project
gradle test      # Run unit tests
gradle fatJar    # Create a fat jar (goes to build/libs folder)
gradle docs      # Create both Java and Kotlin docs (goes to the build/docs folder)
```


## java_project

You must build kotlin_project first. java_project uses the main method and SimpleMath class from kotlin_project.

Tasks
```
gradle idea      # Generate the idea project
gradle test      # Run unit tests
```