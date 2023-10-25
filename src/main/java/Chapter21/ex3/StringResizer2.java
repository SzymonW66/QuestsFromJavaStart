package Chapter21.ex3;

import java.util.Scanner;

public class StringResizer2 {
    public static void main(String[] args) {
        String text = readTextFromConsole();
        text = changeToLowerCaseOrUpperCase(text);
        System.out.println("Tekst po transforamcji ");
        System.out.println(text);

    }

    private static String changeToLowerCaseOrUpperCase(String text) {
        char firstChar = text.charAt(0);
        if(Character.isUpperCase(firstChar)){
            text.toUpperCase();
        }
        else if (Character.isLowerCase(firstChar)){
             text.toLowerCase();
        }
        return text;
    }

    private static String readTextFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź dowolny tekst");
        return scanner.nextLine();
    }
}
