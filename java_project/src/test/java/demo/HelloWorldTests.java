package demo;

import org.junit.Assert;
import org.junit.Test;
import playground.SimpleMath;

public class HelloWorldTests {
  @Test
  public void simpleMath_WhenPassedValues_FunctionsShouldWork() {
    SimpleMath simpleMath = new SimpleMath(1, 3);

    Assert.assertEquals(4, simpleMath.add());
    Assert.assertEquals(-2, simpleMath.sub());
  }
}
