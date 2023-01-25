package Chapter12.ex2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Simulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose 1 for eagle or choose 0 for back");
        int choose = scanner.nextInt();
        CoinFlip coinFlip = new CoinFlip();
        boolean result = coinFlip.isEagleOrBack(choose);
        if (result == true) {
            System.out.println("Congratulation You won");
        }
        else {
            System.out.println("Sorry You lost");
        }

    }
}
