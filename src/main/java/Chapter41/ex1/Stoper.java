package Chapter41.ex1;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            System.out.println("Żeby rozpocząć pomiar czasu wciśnij ENTER");
            in.nextLine();
            Instant i1 = Instant.now();

            System.out.println("Żeby zatrzymać pomiar czasu wciśnij ENTER");
            in.nextLine();
            Instant i2 = Instant.now();

            Duration time = Duration.between(i1, i2);

            System.out.println("Czas który upłynał " + time.getSeconds() + " s");

        }
    }
}
