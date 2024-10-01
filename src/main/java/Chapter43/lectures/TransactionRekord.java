package Chapter43.lectures;

import java.time.LocalDateTime;

public record TransactionRekord(long id, double value, LocalDateTime time) {


    //rekord nie posiada kontrukotra domyślnego z automatu, Jedynie taki ze wszystkimi argumentami

    //generowany automatycznie ale bez if
    public TransactionRekord(long id, double value, LocalDateTime time) {
        if(id <= 0){
            throw new IllegalArgumentException("id must be greater than 0");
        }
        if(time.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("time must be after now");
        }
        this.id = id;
        this.value = value;
        this.time = time;
    }
}
