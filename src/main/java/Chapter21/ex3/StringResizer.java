package Chapter21.ex3;

import java.util.Scanner;

public class StringResizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź dowolny tekst: ");
        String text = scanner.nextLine();
        char firstChar = text.charAt(0);
        if (Character.isUpperCase(firstChar)) {
            text = text.toUpperCase();
        }
        else if (Character.isLowerCase(firstChar)){
            text = text.toLowerCase();
        }
        System.out.println("Tekst po transformacji");
        System.out.println(text);
    }
}
