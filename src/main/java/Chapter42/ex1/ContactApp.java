package Chapter42.ex1;

import java.util.Scanner;

public class ContactApp {
    public static void main(String[] args) {
        ContactReader.readFile("contacts.txt")
                .ifPresentOrElse(ContactApp::findByEmail, ContactApp::fileNotFoundMessage);

    }

    static void findByEmail(ContactManager contactManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj email: ");
        String email = scanner.nextLine();
       contactManager.findByEmail(email)
               .ifPresentOrElse(ContactApp::showShortInfo, ContactApp::contactNotFoundMessage);
    }

    static void fileNotFoundMessage() {
        System.out.println("Brak takiego pliku ");
    }

    private static void showShortInfo(Contact contact) {
        System.out.println("Kontakt o wskazanym adresie email:");
        System.out.println(contact.getShortInfo());
    }

    private static void contactNotFoundMessage() {
        System.out.println("Brak takiego kontaktu");
    }
}
