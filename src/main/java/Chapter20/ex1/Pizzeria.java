package Chapter20.ex1;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        System.out.println("Dostępne pizze: ");
        for (Pizza p : Pizza.values()) {
            System.out.println(p);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Jaką pizzę wybierasz?");
        Pizza pizza = Pizza.valueOf(input.nextLine());

        System.out.println("Dziękujemy za zamówienie pizzy" + pizza.name());
        input.close();
    }
}
