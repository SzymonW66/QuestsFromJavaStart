package Chapter43.lectures;

import java.time.LocalDateTime;

public class TransactionExample {
    public static void main(String[] args) {
        Transaction t = new Transaction(1L, 20.00, LocalDateTime.now());

        Transaction t2 = new Transaction(2L, 20.00, LocalDateTime.now());


    }
}
