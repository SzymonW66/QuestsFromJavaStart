package Chapter44.lectures;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w+@[a-z0-9]+\\.[a-z]{2,}");
        String emails = """
                jan@gmail.com
                blah blah
                marek@tlen.pl
                bleh bleh
                """;
        Matcher matcher = pattern.matcher(emails);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.printf("Początek dopasowania %d, koniec: %d%n", start, end);
            System.out.println("Dopasowanie: " + emails.substring(start, end));
        }
    }
}
