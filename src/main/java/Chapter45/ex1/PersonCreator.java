package Chapter45.ex1;

import java.util.Scanner;

public class PersonCreator {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Person person = createPerson();
        String outputFormat = readOutputFormat();
        printFormatted(person, outputFormat);
    }

    private static void printFormatted(Person person, String outputFormat) {
        String output = switch (outputFormat){
            case "JSON" -> person.toJson();
            case "XML" -> person.toXml();
            default -> person.toString();
        };
        System.out.println(STR."Oto obiekt w formacie \{outputFormat}");
        System.out.println(output);
    }

    private static String readOutputFormat() {
        System.out.println("Wybierz format danych");
        return sc.nextLine();
    }

    private static Person createPerson() {
        System.out.println("Wprowadź informacje o osobie");
        System.out.println("Imie");
        String firstName = sc.nextLine();
        System.out.println("Nazwisko");
        String lastName = sc.nextLine();
        System.out.println("Wiek");
        int age = sc.nextInt();

        return new Person(firstName, lastName, age);
    }
}
