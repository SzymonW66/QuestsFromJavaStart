package Chapter32.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class NameReader {
    public static void main(String[] args) {
        final String fileName = "namespl.txt";
        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });

        try(Scanner scanner = new Scanner(new File(fileName))){
            while (scanner.hasNext()){
                names.add(scanner.nextLine());
            }
            System.out.println("Liczba imion w zbiorze" + names.size());
            System.out.println("Pierwszę imię " + names.first());
            System.out.println("Ostatnie imię " + names.last());

        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku " + fileName);
        }


    }
}
