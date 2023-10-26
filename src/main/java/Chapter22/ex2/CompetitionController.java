package Chapter22.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompetitionController {
    private Scanner scanner = new Scanner(System.in);

    void run(){
        Competiton competiton = createCompetion();
        fillPartipiciantsInfo(competiton);
        printCompetition(competiton);
    }

    private void printCompetition(Competiton competiton) {
        System.out.println(competiton.toString());
    }

    private void fillPartipiciantsInfo(Competiton competiton) {
        while(competiton.hasFreeSpot()){
            System.out.println("Dodaj nowego uczestnika");
            Participant participant = createNewParticipant();
            try {
                competiton.addParticipant(participant);
            }catch (AgeViolationException e){
                System.out.println("Nie dodano uczestnika, minimalny wiek to" + e.getAgeAquired());
            }catch (DuplicateException e){
                System.out.println("Uczestnik o wskazanym numerze został już dodany do tych zawodów " + e.getParticipant());
            }catch (MaxCompetitorsException e){
                System.out.println("Osiągnięto już maksymalną liczbę uczestników " + e.getMaxCompetitiors());
            }
        }
    }

    private Participant createNewParticipant() {
        System.out.println("Podaj imię");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String lastName = scanner.nextLine();
        System.out.println("Podaj numer PESEL");
        String id = scanner.nextLine();
        System.out.println("Podaj wiek uczestnika");
        int age = scanner.nextInt();
        return new Participant(name, lastName, id, age);
    }

    private Competiton createCompetion() {
        System.out.println("Podaj nazwę zawodów");
        String competitionName = scanner.nextLine();
        System.out.println("Podaj maksymalną liczbę uczestników");
        int maxParticipants = readPositiveNumber();
        System.out.println("Podaj ograniczenie wiekowe");
        int ageLimit = readPositiveNumber();
        return new Competiton(competitionName, maxParticipants, ageLimit);
    }

    private int readPositiveNumber() {
       int number = -1;
       while (number < 0){
           try{
               number = scanner.nextInt();
               if (number < 0){
                   System.out.println("Podana liczba musi być dodatnia");
               }
           } catch (InputMismatchException e){
               System.out.println("Musisz podać ponownie liczbę: ");
           }
           finally {
               scanner.nextLine();
           }
       }
       return number;
    }

}
