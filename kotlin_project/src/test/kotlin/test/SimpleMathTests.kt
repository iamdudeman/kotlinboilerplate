package test

import org.junit.Test
import kotlin.test.assertEquals

class SimpleMathTests {
    @Test
    fun add_WithNoRight_ShouldAddOne() {
        val simpleMath = SimpleMath(1)

        assertEquals(2, simpleMath.add())
    }

    @Test
    fun add_WithRight_ShouldAddRight() {
        val simpleMath = SimpleMath(2, 5)

        assertEquals(7, simpleMath.add())
    }

    @Test
    fun sub_WithNoRight_ShouldSubOne() {
        val simpleMath = SimpleMath(2)

        assertEquals(1, simpleMath.sub())
    }

    @Test
    fun sub_WithRight_ShouldSubRight() {
        val simpleMath = SimpleMath(2, 2)

        assertEquals(0, simpleMath.sub())
    }
}