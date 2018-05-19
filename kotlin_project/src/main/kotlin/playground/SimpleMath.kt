package playground

/**
 * Initialize a SimpleMath object
 * @param left - The left operand
 * @param right - The right operand
 */
class SimpleMath(
  private val left: Int,
  private val right: Int = 1
) {
  /**
   * Adds the two values
   * @return The additional of the two values
   */
  fun add() : Int {
    return left + right
  }

  /**
   * Subtracts right from left.
   * @return The subtraction of the right from the left
   */
  fun sub() : Int {
    return left - right
  }
}
