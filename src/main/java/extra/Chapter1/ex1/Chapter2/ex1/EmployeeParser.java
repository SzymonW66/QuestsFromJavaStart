package extra.Chapter1.ex1.Chapter2.ex1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.List;
import java.util.OptionalDouble;

public class EmployeeParser {
    private record Employee(String firstName, String lastName, double salary) {
    }

    private static Employee textToEmployee(String text) {
        String[] split = text.split(";");
        return new Employee(split[0], split[1], Double.parseDouble(split[2]));
    }


    public static void main(String[] args) {
        try {
            List<Employee> employees = readEmployeeData(Path.of("input.csv"));
            OptionalDouble avgSalary = getAvgSalary(employees);
            avgSalary.ifPresentOrElse(
                    avg -> saveAvgSalary(avg, Path.of("avg.txt")),
                    () -> System.out.println("Brak danych w pliku wejściowym")
            );
        } catch (IOException e) {
            System.err.println("Nie udało się odczytać pliku wejściowego. Upewnij się, że plik istnieje");
        }
    }

    private static void saveAvgSalary(double avg, Path path) {
        LocalDateTime now = LocalDateTime.now();
        String lineToSave = STR."{\{now};\{avg}\n";
        try {
            if (Files.notExists(path)) {
                Files.createFile(path);
            }
            Files.writeString(path, lineToSave, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println("Nie udało się znaleźć pliku");
        }
    }

    private static OptionalDouble getAvgSalary(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::salary)
                .average();
    }

    private static List<Employee> readEmployeeData(Path path) throws IOException {
        return Files.readAllLines(path)
                .stream()
                .skip(1)
                .map(EmployeeParser::textToEmployee)
                .toList();
    }
}
