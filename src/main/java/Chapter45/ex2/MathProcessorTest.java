package Chapter45.ex2;

import java.math.BigInteger;

import static Chapter45.ex2.MathProcessor.MATH;

public class MathProcessorTest {
    public static void main(String[] args) {
        System.out.println(MATH."1000000000000 + 2");

        int a = 5;
        int b = 10;
        BigInteger result = MATH."\{a} / \{b}";
        System.out.println(result);

        System.out.println(MATH."50 *    2");
    }
}
