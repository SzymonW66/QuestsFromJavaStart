package Chapter45.lectures.lec1;

import java.util.List;

import static java.lang.StringTemplate.*;

public class Testic {
    public static void main(String[] args) {
        String product = "Czekolada";
        double price = 2.99;
        String msg = "Wybrany produkt to: " + product + " price: " + price;

        System.out.println(msg);

        //Java21
        String msg2 = STR."Wybrany produkt to: \{product}, jego cena wynosi: \{price}";

        String firstName = "Jan";
        int age1 = 20;
        StringTemplate template = StringTemplate.of(
                List.of("", " za rok będzie miał ", " lat"),
                List.of(firstName, age1 + 1)
        );

        String firstName1 = "Jan";
        int age = 20;
        StringTemplate template1 = RAW."\{firstName1} za rok będzie miał \{age + 1} lat";
        System.out.println(template1.fragments()); //["", " za rok będzie miał ", " lat"]
        System.out.println(template1.values()); //["Jan", 21]
        System.out.println(template1.interpolate()); //Jan za rok będzie miał 21 lat

        String firstName2 = "Jan";
        int age2 = 20;
        String result = STR."\{firstName2} za rok będzie miał \{age2 + 1} lat";
        System.out.println(result); //Jan za rok będzie miał 21 lat
    }
}
