package Chapter31.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumNumbers {
    public static final String EXIT = "exit";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        fillList(numbers);
        printList(numbers);
    }

    private static void printList(List<Double> numbers) {
        if (!numbers.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            double sum = 0;
            for (Double number : numbers) {
                sb.append(number);
                sb.append("+");
                sum += number;
            }
            sb.replace(sb.length() - 1, sb.length(), "=");
            sb.append(sum);
            System.out.println(sb.toString());
        }
    }

    private static void fillList(List<Double> numbers) {
        System.out.println("Podaj kolejną liczbę lub wpisz exit aby wyjść");
        String input = scanner.nextLine();
        if (input.equals(EXIT)) {
            return;
        }
        try {
            Double num = Double.valueOf(input);
            numbers.add(num);
        } catch (NumberFormatException e) {
            System.out.println("Podano zły typ liczbowy");
        }
        fillList(numbers);
    }
}
