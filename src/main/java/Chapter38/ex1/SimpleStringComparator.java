package Chapter38.ex1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SimpleStringComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Karol", "Wojtek", "Alicja", "Bartek", "Romek");
        //lambda
        Collections.sort(names, (String p1, String p2) -> p1.compareToIgnoreCase(p2) );
        //reference
        Collections.sort(names, String::compareToIgnoreCase);
        //jeszcze szybciej
        names.sort(String::compareToIgnoreCase);
        names.forEach(System.out::println);

    }
}
