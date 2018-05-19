package demo;

import test.HelloWorldKt;
import test.SimpleMath;

public class HelloWorld {
    public static void main(String[] args) {
        SimpleMath simpleMath = new SimpleMath(1, 2);

        System.out.println(simpleMath.add());

        HelloWorldKt.main(args);
    }
}
