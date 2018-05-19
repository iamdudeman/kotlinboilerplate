package demo;

import org.junit.Test;
import test.SimpleMath;

public class HelloWorldTests {
    @Test
    public void test() {
        SimpleMath simpleMath = new SimpleMath(1, 3);

        simpleMath.add();
        simpleMath.sub();
    }
}
