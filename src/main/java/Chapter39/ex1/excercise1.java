package Chapter39.ex1;

import java.util.stream.Stream;

public class excercise1 {
    public static void main(String[] args) {
        Stream.iterate(0, i -> i + 1)
                .filter(x -> x > 100 && x < 1000 && x%5 == 0)
                .limit(10)
                .map(x -> x * 3)
                .forEach(System.out::println);
    }

}
