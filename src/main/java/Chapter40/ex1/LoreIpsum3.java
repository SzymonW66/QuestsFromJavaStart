package Chapter40.ex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoreIpsum3 {
    public static void main(String[] args) {
        final String fileName = "LoreIpsum.txt";

        List<String> words = null;

        try {
            words = readFile(fileName);
            showWordStats(words);
        } catch (IOException e) {
            System.err.println("Błąd odczytu pliku " + fileName);
            ;
        }
    }

    private static void showWordStats(List<String> words) {
        long countSWords = words.stream()
                .filter(word -> word.startsWith("s"))
                .peek(System.out::println)
                .count();

        long fiveLetters = words.stream()
                .filter(word -> word.length() == 5)
                .peek(System.out::println)
                .count();


        System.out.println("Liczba wyrazów na s " + countSWords);
        System.out.println("Liczba wyrazów z 5 literami " + fiveLetters);
    }

    private static List<String> readFile(String fileName) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            List<String> words = new ArrayList<String>();

            return br.lines()
                    .map(line -> line.split(" "))
                    .flatMap(Arrays::stream)
                    .map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
                    .collect(Collectors.toList());
        }
    }
}
