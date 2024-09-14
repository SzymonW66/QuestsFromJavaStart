package Chapter41.lectures;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeTest {
    public static void main(String[] args) throws InterruptedException {
        Instant now = Instant.now(); //Czas od 1970
        for (int i = 0; i < 100; i++) {
            System.out.println("Miernik czasu");
        }
        Instant now2 = Instant.now();
        Duration timeGap = Duration.between(now, now2);
        System.out.println(timeGap.getNano());


        LocalTime now1 = LocalTime.now();

        for (int i = 0; i < 5; i++) {
            System.out.println(now1.getHour() + "-" + now1.getMinute() + "-" + now1.getSecond());
            now1 = now1.plusSeconds(1);
            Thread.sleep(1000);
        }

        LocalDate now3 = LocalDate.now();
        LocalDate date = LocalDate.of(2014,1,1);

        System.out.println(now3.getDayOfYear());

        boolean after = now3.isAfter(date);

        System.out.println(after);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tworze nowe wydarzenie");

        System.out.println("Podaj date");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateIntput = scanner.nextLine();

        LocalDate createdDate = LocalDate.parse(dateIntput, dateTimeFormatter);

        System.out.println("Wydarzenie utworzone na dzień: " + createdDate);

    }
}
