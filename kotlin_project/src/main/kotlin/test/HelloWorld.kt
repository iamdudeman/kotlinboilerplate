package test

/**
 * Get the greeting.
 * @return The greeting
 */
fun getGreeting(): String {
    val words = mutableListOf<String>()
    words.add("Hello,")
    words.add("world!")

    return words.joinToString(separator = " ")
}

/**
 * Main entry point
 * @param args - CLI args
 */
fun main(args: Array<String>) {
    println(getGreeting())
}
