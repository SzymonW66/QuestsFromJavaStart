package Chapter43.lectures;

import java.time.LocalDateTime;

public record TransactionRecord2(long id, double value, LocalDateTime time) {

    public TransactionRecord2 {
        if(id <= 0){
            throw new IllegalArgumentException("id must be greater than 0");
        }
        if(time.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("time must be after now");
        }
        // Kompaktowy nie zawiera this.coś = coś tylko same ify jak je potrzebujemy
        //pola są domyślnei finalne
        //metoda equals porównuje wszystkie arguemnty w obiekcie utworzonmym z rekordów a nie referencje  (hashcode to samo)
        // można to jednak nadpisać i będzie sprawdzało tylko po id
    }
}
