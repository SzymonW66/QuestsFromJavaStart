package Chapter41.ex2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Dates2 {
    public static void main(String[] args) {
        try {
            LocalDate date2 = readDateFromUser();
            LocalDate date1 = readDateFromUser();
            showLaterDate(date1, date2);
            showPeriodBetween(date1, date2);
        } catch (DateTimeParseException e) {
            System.out.println("Podano date w nieprawidłowy sposób");
        }
    }

    private static void showPeriodBetween(LocalDate date1, LocalDate date2) {
        Period between = Period.between(date1, date2);
        int days = Math.abs(between.getDays());
        int months = Math.abs(between.getMonths());
        int years = Math.abs(between.getYears());
        System.out.printf("Podane daty dzieli %d lat, %d miesięcy i %d dni", years, months, days);
    }

    private static void showLaterDate(LocalDate date1, LocalDate date2) {
        LocalDate localDate = date1.isAfter(date2) ? date1 : date2;
        System.out.println("Późniejsza data to " + localDate);
    }

    private static LocalDate readDateFromUser() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Podaj date w formacie yyyy-MM-dd");
            String dateInput = in.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            return LocalDate.parse(dateInput, formatter);
        }
    }
}
