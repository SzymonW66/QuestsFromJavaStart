package Chapter32.ex2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProductManager {
    private static final int ADD_PRODUCT = 0;
    private static final int EXIT = 1;
    private static final int DISCARD_PRODUCT = 2;
    private static final int REPLACE_PRODCUT = 3;

    private Set<Product> productSet = new HashSet<>();
    private Scanner scanner = new Scanner(System.in);

    void mainLoop() {
        int option;
        do {
            printOptions();
            option = readOption();
            evaluateOption(option);
        } while (option != EXIT);
    }

    private void evaluateOption(int option) {
        if (option == ADD_PRODUCT) {
            addNextProduct();
        } else if (option == EXIT) {
            printProducts();
        } else
            System.out.println("Nieznana opcja");
    }

    private void addNextProduct() {
        Product product = createProduct();
        if (productSet.contains(product)) {
            askAndReplaceProduct(product);
        } else {
            addProduct(product);
        }
    }

    private void addProduct(Product product) {
        productSet.add(product);
        System.out.println("Produkt dodany do bazy");
    }

    private void askAndReplaceProduct(Product product) {
        System.out.println("Znaleziono produkt o takiej samej nazwie: ");
        System.out.println("> Zignoruj produkt " + DISCARD_PRODUCT);
        System.out.println("> Nadpisz produkt " + REPLACE_PRODCUT);
        int option = readOption();
        if (option == REPLACE_PRODCUT) {
            productSet.remove(product);
        } else
            System.out.println("W bazie pozostawiono produkt");
    }

    private Product createProduct() {
        System.out.println("Podaj nazwę produktu: ");
        String name = scanner.nextLine();
        System.out.println("Podaj cenę tego produktu: ");
        double price = scanner.nextDouble();
        return new Product(name, price);
    }

    private void printProducts() {
        System.out.println("Wszystkie produkty");
        for (Product product : productSet) {
            System.out.println(product);
        }

    }


    private void printOptions() {
        System.out.println("Dostępne opcje");
        System.out.println("> Dodaj nowy produkt " + ADD_PRODUCT);
        System.out.println("> Koniec programu " + EXIT);
    }

    private int readOption() {
        System.out.println("Wybierz opcje");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

}
