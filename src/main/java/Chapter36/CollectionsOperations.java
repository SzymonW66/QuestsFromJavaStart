package Chapter36;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CollectionsOperations {
    public static void main(String[] args) {
        String sentence = "Raz dwa trzy cztery piec";
        List<String> words = Arrays.asList(sentence.split(" "));

        System.out.println("List w orginale");
        printCollection(words);

        Collections.shuffle(words);
        System.out.println("Lista shuffle");
        printCollection(words);

        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Lista sort: ");
        printCollection(words);

        int cztery = Collections.binarySearch(words, "piec");
        System.out.println(cztery);

        Collections.frequency(words, "piec");

    }

    private static void printCollection(List<String> words) {
        for (String word : words) {
            System.out.println(word + ";");
        }
        System.out.println();
    }
}
