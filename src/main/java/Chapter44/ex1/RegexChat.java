package Chapter44.ex1;

import java.util.Scanner;

public class RegexChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cześć, jestem nowym Chatbotem!");
        System.out.println("W czym moge pomóc? (\"koniec\" przerwywa program)");

        boolean close = false;

        do {
            String input = scanner.nextLine();
            try {
                String result = QuestionEvaluatorFacade.evaluate(input);
                System.out.println(result);
            } catch (IllegalArgumentException iae) {
                if(input.equalsIgnoreCase("koniec")) {
                    close = true;
                } else {
                    System.out.println("Niestety nie mogę Ci pomóc");
                }
            }
        } while (!close);
    }
}
