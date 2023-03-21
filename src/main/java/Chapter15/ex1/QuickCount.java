package Chapter15.ex1;

import java.util.Scanner;

public class QuickCount {
    public static void main(String[] args) {
        int sum= 0;
        int next= 0;

        Scanner scanner = new Scanner(System.in);

        while((next = scanner.nextInt()) != 0) {
            sum += next;
        }

        int mod = sum % 2;

        if(mod == 0) {
            System.out.println("Parzysta");
        }
        else {
            System.out.println("Nieparzysta");
        }


    }
}
