package Chapter41.ex2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Dates1 {
    public static void main(String[] args) {
        LocalDate date1 = readLocalDateFromUser();
        LocalDate date2 = readLocalDateFromUser();
        showLaterDate(date1, date2);
        showPeriodBetween(date1, date2);
    }

    private static void showPeriodBetween(LocalDate date1, LocalDate date2) {
        Period between = Period.between(date1, date2);
        int day = Math.abs(between.getDays());
        int month = Math.abs(between.getMonths());
        int year = Math.abs(between.getYears());
        System.out.printf("Podane daty dzieli %d lat, %d miesięcy i %d dni", day, month, year);
    }

    private static void showLaterDate(LocalDate date1, LocalDate date2) {
        LocalDate laterDate = date1.isAfter(date2) ? date1 : date2;
        System.out.println("Poźniejsza data to " + laterDate);
    }

    private static LocalDate readLocalDateFromUser() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Podaj rok miesiąca");
            int day = in.nextInt();
            System.out.println("Podaj miesiąc");
            int month = in.nextInt();
            System.out.println("Podaj rok");
            int year = in.nextInt();
            return LocalDate.of(year, month, day);
        }
    }

}
