package Chapter21.ex2;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wciśnij Enter, żeby rzucić kostką");
        scanner.nextLine();
        String diceSide = Dice.roll();
        System.out.println(diceSide);
    }
}
