package Chapter13.ex3;

import java.util.Scanner;

public class TemptureControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give acutal temperature");
        double actualTemp = scanner.nextDouble();
        System.out.println("Give destinantion temperature");
        double destTemp = scanner.nextDouble();

        while (actualTemp < destTemp) {
            actualTemp += 0.5;
            System.out.println(actualTemp);
        }
        System.out.println("Achived temp : " + actualTemp);

        while (actualTemp > destTemp) {
            actualTemp -= 0.5;
            System.out.println(actualTemp);
            System.out.println("Achived temp : " + actualTemp);
        }

    }
}
