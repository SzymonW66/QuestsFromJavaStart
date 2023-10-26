package Chapter22.ex1;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        double a = 0;
        double b = 0;
        String operator = null;

        boolean readComplete = false;

        while(!readComplete){
            try{
                System.out.println("Podaj pierwszą liczbę: ");
                a = input.nextDouble();
                input.nextLine();
                System.out.println("Podaj druą liczbę: ");
                b = input.nextDouble();
                input.nextLine();
                System.out.println("Podaj operator arytmetyczny (+, -, *, /");
                input.nextLine();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono niepoprawne dane spróbuj ponownie");
                input.nextLine();
            }
        }
        try {
          double result = Calculator.calculate(a, b, operator);
            System.out.println(a + operator + b);
        }catch (UnknownOperatorException | ArithmeticException e){
            System.err.println(e.getMessage());
            System.err.println("Nie udało się wykonać działania dla podanych danych");
        }

    }
}
