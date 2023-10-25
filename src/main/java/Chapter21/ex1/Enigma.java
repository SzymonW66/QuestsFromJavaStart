package Chapter21.ex1;

import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę wyrazów jakie chcesz podać ");
        int worldsNumber = input.nextInt();
        input.nextLine();
        String [] worlds = new String[worldsNumber];

        for (int i = 0; i <= worldsNumber; i++) {
            System.out.println("Podaj kolejne słowo ");
            worlds[i] = input.nextLine();
        }

        StringBuilder build = new StringBuilder();

        for (int i = 0; i <= worldsNumber; i++){
            build.append(worlds[i].charAt(worlds[i].length() - 1));
        }
        System.out.println("Nowe słowo " + build.toString());

        input.close();
    }
}
