package Chapter30.ex1;

import java.util.Arrays;
import java.util.Comparator;

public class NumberComparator {
    public static void main(String[] args) {
        Integer [] numbers = {1, 222, 3, 42, 5, 6, 7, 80, 9, 102, 11, 132, 3, 14, 1, 16, 17, 8, 19, 20};

        System.out.println("Nieposortowana");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Posortowane rosnąco");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               return -(o1.compareTo(o2));
            }
        });

        System.out.println("Posortowana malejąco");
        System.out.println(Arrays.toString(numbers));
    }

}
