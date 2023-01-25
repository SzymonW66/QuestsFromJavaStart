package Chapter13.ex1;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz zsumować: ");
        int counter = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < counter; counter--){
            System.out.println("Podaj liczbę do zsumowania: ");
            int number = scanner.nextInt();
            result += number;
            System.out.println("Aktualna suma = " + result);

        }
        scanner.close();
        System.out.println("Łączna suma = " + result);
    }
}
