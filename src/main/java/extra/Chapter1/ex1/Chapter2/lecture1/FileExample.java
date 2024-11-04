package extra.Chapter1.ex1.Chapter2.lecture1;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {
    public static void main(String[] args) {
        //File file = new File("example.txt");
        //boolean delete = file.delete();
        Path path = Paths.get("example.txt");
        Path path2 = Path.of("example.txt");


    }
}
