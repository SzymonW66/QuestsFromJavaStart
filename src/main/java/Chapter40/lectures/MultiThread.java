package Chapter40.lectures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiThread {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        ints = ints.stream()
                .map(MultiThread::incrementalValue)
                .collect(Collectors.toList());

        List<Integer> ints1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        ints1 = ints1.stream()
                .parallel()
                .map(MultiThread::incrementalValue)
                .collect(Collectors.toList());

    }

    private static int incrementalValue(Integer integer) {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Przetwarzam " + integer);
        return integer + 1;
    }




}
