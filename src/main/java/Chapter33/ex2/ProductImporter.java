package Chapter33.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductImporter {

    static Map<String, TreeSet<Product>> readFile(String fileName) throws FileNotFoundException {
        Map<String, TreeSet<Product>> productsMap = new HashMap<>();
        try
                (Scanner scanner = new Scanner(new File(fileName))) {
                scanner.nextLine();
                while (scanner.hasNextLine()){
                    String [] data = scanner.nextLine().split(";");
                    String category = data[0];
                    Product product = new Product(data[1], Double.parseDouble(data[2]));
                    if (productsMap.containsKey(category)){
                        productsMap.get(category).add(product);
                        //dodajmy produkt do istniejącej kategorii
                    }
                    else {
                        TreeSet<Product> categorySet = new TreeSet<>();
                        categorySet.add(product);
                        productsMap.put(category, categorySet);
                        //dodajemy nową kategorię (klucz) wraz z pierwszym produktem
                    }
                }
        }
        return productsMap;
    }
}
