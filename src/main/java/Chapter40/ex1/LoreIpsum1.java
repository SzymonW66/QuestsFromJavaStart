package Chapter40.ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoreIpsum1 {
    public static void main(String[] args) throws IOException {
        final String fileName = "LoreIpsum.txt";
        var reader = new BufferedReader(new FileReader(fileName));

        List<String> words = new ArrayList<String>();

        String tmp = null;

        while ((tmp = reader.readLine()) != null) {
            words.addAll(Arrays.asList(tmp.split(" ")));
        }

        words = words.stream()
                .map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
                .collect(Collectors.toList());

        long countSWords = words.stream()
                .filter(s -> s.startsWith("s"))
                .peek(s -> System.out.println(s + " "))
                .count();

        System.out.println();

        long fiveLetters = words.stream()
                .map(s -> s.length() == 5)
                .peek(s -> System.out.println(s + " "))
                .count();

        System.out.println();

        System.out.println(fiveLetters);

        System.out.println(countSWords);

        reader.close();


    }
}
