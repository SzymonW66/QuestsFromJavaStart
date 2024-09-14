package Chapter40.ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoreIpsum2 {
    public static void main(String[] args) throws IOException {
        final String fileName = "LoreIpsum.txt";
        var reader = new BufferedReader(new FileReader(fileName));

        List<String> words = reader.lines()
                .map(line -> line.split(" "))
                .flatMap(Arrays::stream)
                .map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
                .collect(Collectors.toList());

        long countSWords = words.stream()
                .filter(s -> s.startsWith("s"))
                .peek(s -> System.out.print(s + " "))
                .count();
        System.out.println();

        long fiveLetter = words.stream()
                .filter(s -> s.length() == 5)
                .peek(s -> System.out.print(s + " "))
                .count();
        System.out.println();

        System.out.println("Liczba wyrazów na s " + countSWords);
        System.out.println("Liczba wyrazów z 5 literami " + fiveLetter);
        reader.close();
    }
}
