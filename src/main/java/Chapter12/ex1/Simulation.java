package Chapter12.ex1;

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Give operator: ");
        String operator = scanner.nextLine();
        System.out.println("Give number1: ");
        double number1 = scanner.nextDouble();
        System.out.println("Give number2: ");
        double number2 = scanner.nextDouble();

       double result = calculator.calculate(number1, number2, operator);
        System.out.println(result);
        scanner.close();
    }

}
