package Chapter40.lectures;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberStream {

    private static final int DIVIDER = 10;

    public static void main(String[] args) {
//        Stream<Integer> numStream = Stream.iterate(0, x -> x + 1);
//        List<Integer> squareNumbers = numStream.map(x -> x * x)
//                .limit(100)
//                .collect(Collectors.toList());
//
//
//        Set<Integer> biggerThan5 = squareNumbers.stream().filter(x -> x % 10 == 0)
//                .map(x -> x / 10)
//                .collect(Collectors.toCollection(TreeSet<Integer>::new));
//
//        System.out.println("List");
//        squareNumbers.forEach(x -> System.out.print(x + " ; "));
//        System.out.println("\nSet");
//        biggerThan5.forEach(x -> System.out.print(x + " ; "));


//        Stream<Integer> numStream = Stream.iterate(0, x -> x + 1);
//        List<Integer> squareNumbers = numStream.map(NumberStream::square)
//                .limit(100)
//                .collect(Collectors.toList());
//
//        Set<Integer> biggerThan5 = squareNumbers.stream()
//                .filter(NumberStream::isDividedBy)
//                .map(NumberStream::divide)
//                .collect(Collectors.toCollection(TreeSet<Integer>::new));
//
//
//    }

//
//        List<Integer> squareNumbers = IntStream.range(0, 100)
//                .map(NumberStream::square)
//                .boxed()
//                .collect(Collectors.toList());
//
//
//        Set<Integer> biggerThan5 = squareNumbers.stream()
//                .filter(NumberStream::isDividedBy)
//                .map(NumberStream::divide)
//                .collect(Collectors.toCollection(TreeSet<Integer>::new));







    }


    private static int divide(Integer integer) {
        return integer / DIVIDER;
    }

    private static boolean isDividedBy(Integer integer) {
        return integer % DIVIDER == 0;
    }

    private static int square(Integer integer) {

        return integer * integer;

    }
}
