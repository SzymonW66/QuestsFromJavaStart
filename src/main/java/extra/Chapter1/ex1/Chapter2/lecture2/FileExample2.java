package extra.Chapter1.ex1.Chapter2.lecture2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileExample2 {
    public static void main(String[] args) {
        try {
            Files.createFile(Path.of("example2.txt"));
            Path path = Path.of("example2.txt");
            Path target = Path.of("example3.txt");
            String content = "This what we want to save in file";
            Files.writeString(path, content);
            Files.writeString(path, content, StandardOpenOption.APPEND);
            String readings = Files.readString(path);
            System.out.println(readings);
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
            Files.copy(path, target);
           // Files.move(path, target);
            System.out.println("File created");
            //Files.delete(Path.of("example2.txt"));
            //Files.deleteIfExists(Path.of("example2.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (Files.exists(Path.of("example2.txt"))) {
            System.out.println("Plik istnieje");
        } else {
            System.out.println("Plik nie istnieje");
        }
    }
}
