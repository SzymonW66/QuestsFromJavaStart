package Chapter33.ex2;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductManager {
    public static void main(String[] args) {

        try {
            Map<String, TreeSet<Product>> productsMap = ProductImporter.readFile("file.csv");
            String category = scanCategoryFromUser();
            printCategoryStats(category, productsMap);

        } catch (FileNotFoundException e) {
            System.out.println("Problem z plikiem");
        }


    }

    private static void printCategoryStats(String category, Map<String, TreeSet<Product>> productsMap) {
        TreeSet<Product> products = productsMap.get(category);
        if (category == null) {
            System.out.println("Brak podanej kategorii");
        } else{
            printAll(products);
            printAvgPrice(products);
            printCheapestAndExpensiveProducts(products);
        }
    }

    private static void printCheapestAndExpensiveProducts(TreeSet<Product> products) {
        System.out.println("Cena najtańszego wynosi " + products.first().getPrice());
        System.out.println("Cena najdroższego wynosi " + products.last().getPrice());
    }

    private static void printAvgPrice(TreeSet<Product> products) {
        double sumPrice = 0;
        for (Product product : products) {
            sumPrice += product.getPrice();
        }
        double avgPrice = sumPrice/ products.size();
        System.out.println("Średnia wynosi " + avgPrice);
    }

    private static void printAll(TreeSet<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }

    }

    private static String scanCategoryFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kategorię dla której chcesz wyświetlić produkty: ");
        return scanner.nextLine();
    }
}
