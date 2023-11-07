package Chapter29.ex2;

import java.util.Arrays;
import java.util.Scanner;

public class StringUtils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj napis nr 1");
        String word1 = scanner.nextLine();
        System.out.println("Podaj napis nr 2");
        String word2 = scanner.nextLine();
        boolean compareResutl = compareLetters(word1, word2);
        if (compareResutl == true) {
            System.out.println("Napisy są takie same");
        } else
            System.out.println("Napisy nie są takie same");
    }

    private static boolean compareLetters(String word1, String word2) {
        if (word1 == null && word2 == null) {
            return true;
        }
        if (word1 == null || word2 == null || word1.length() != word2.length()) {
            return false;
        }
        char[] chars1 = word1.toLowerCase().toCharArray();
        char[] chars2 = word2.toLowerCase().toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
}
