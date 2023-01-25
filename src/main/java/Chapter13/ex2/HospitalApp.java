package Chapter13.ex2;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        final int exit = 0;
        final int addPatient = 1;
        final int printPatients = 2;

        Scanner scanner = new Scanner(System.in);
        int option = -1;

        Hospital hospital = new Hospital();

        while (option != exit) {
            System.out.println("Possible options");
            System.out.println("0- exit");
            System.out.println("1- addPatient");
            System.out.println("2- printPatient");

            System.out.println("Choose options");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case addPatient:
                    System.out.println("Give name");
                    String name = scanner.nextLine();
                    System.out.println("Give Last name");
                    String lastName = scanner.nextLine();
                    System.out.println("Give PESEL");
                    String pesel = scanner.nextLine();
                    Patient patient = new Patient(name, lastName, pesel);
                    hospital.addPatient(patient);
                    break;

                case printPatients:
                    hospital.printPatients();
                    break;

                case exit:
                    System.out.println("Closeing program! ");
                    break;

                default:
                    System.out.println("There is no such options");
            }


        }
        scanner.close();
    }


}
