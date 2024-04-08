package Chapter39.lectures.lec1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) throws FileNotFoundException {
        Stream<String> stream = Stream.of("a", "b", "c");
//        //a -> b -> c
//        stream.forEach(System.out::println);
//        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);

//       IntStream evenStream = intStream.filter(x -> x % 2 == 0);
//        int[] ints = evenStream.toArray();
//        System.out.println(Arrays.toString(ints));

        int[] evenNumbers2 = intStream
                .filter(x -> x % 2 == 0)
                .toArray();
        System.out.println(Arrays.toString(evenNumbers2));

        //.map - mapowanie- możemy wykonac na kazdym obiekcie w strumieniu w wynkiku dostajemy nowy strumeń (zmiana typu)
        String[] array = stream.map(s -> s.toUpperCase()).toArray(String[]::new);
        System.out.println(Arrays.toString(array));

        IntStream numStream = IntStream
                .iterate(0, x -> x + 1)
                .limit(100);

        int[] numbers = numStream.toArray();
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = IntStream.iterate(0, x -> x + 1)
                .limit(100)
                .map(x -> x*x)
                .filter(x -> x % 2 == 0)
                .toArray();
        System.out.println(Arrays.toString(numbers2));


        Scanner scanner = new Scanner(new File("example.txt"));
        scanner.tokens()
                .map(String::toUpperCase)
                .filter(x -> x.length() > 0)
                .forEach(System.out::println);


    }
}
