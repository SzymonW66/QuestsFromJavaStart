package Chapter15.ex2;

import java.util.Scanner;

public class QucikAlgorythm {
    public static void main(String[] args) {
        int index = 0;
        int multi = 1;
        int next = 0;

        Scanner scanner = new Scanner(System.in);

        while (index < 5) {
            next = scanner.nextInt();
            multi = multi * next;
            index ++;
        }

        if (multi >= 0) {
            System.out.println("Nieujemna");
        }

        else
            System.out.println("Ujemna");

    }
}
