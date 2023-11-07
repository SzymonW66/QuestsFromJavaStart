package Chapter33.ex1;

import java.util.Scanner;

public class CompanyApp {
    private static final int ADD_EMPLOYEE = 0;
    private static final int FIND_EMPLOYEE = 1;
    private static final int EXIT = 2;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Company company = new Company();
        int userOption;

        do {
            printOptions();
            System.out.println("Wybierz opcję");
            userOption = scanner.nextInt();
            scanner.nextLine();
            switch (userOption){
                case ADD_EMPLOYEE:
                    Emploee emploee = readAndCreateEmployee();
                    company.addEmployee(emploee);
                    break;
                case FIND_EMPLOYEE:
                    findEmployee(company);
                    break;
                case EXIT:
                    System.out.println("Zamknięcie programu");
            }
        } while (userOption != EXIT);
    }

    private static void findEmployee(Company company) {
        System.out.println("Podaj imię ");
        String firstName = scanner.nextLine();
        System.out.println("podaj nazwisko");
        String lastName = scanner.nextLine();
        Emploee emploee1 = company.getEmployee(firstName, lastName);
        if (emploee1 == null){
            System.out.println("Brak takiego pracownika");
        }
    }

    private static Emploee readAndCreateEmployee() {
        System.out.println("Podaj imię pracownika: ");
        String firstName = scanner.nextLine();
        System.out.println("Podaj naziwsko pracownika: ");
        String lastName = scanner.nextLine();
        System.out.println("Podaj wypłatę: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        return new Emploee(firstName, lastName, salary);
    }

    private static void printOptions() {
        System.out.println(ADD_EMPLOYEE + " - dodaj pracownika");
        System.out.println(FIND_EMPLOYEE + " - znajdź pracownika");
        System.out.println(EXIT + " - wyjdź z proramu");
    }
}
