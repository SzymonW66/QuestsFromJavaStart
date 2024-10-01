package Chapter43.lectures;

import java.time.LocalDateTime;
import java.util.Objects;

public class Transaction {
    private Long id;
    private double value;
    private LocalDateTime purchasedAt;

    public Transaction(Long id, double value, LocalDateTime purchasedAt) {
        this.id = id;
        this.value = value;
        this.purchasedAt = purchasedAt;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public LocalDateTime getPurchasedAt() {
        return purchasedAt;
    }

    public void setPurchasedAt(LocalDateTime purchasedAt) {
        this.purchasedAt = purchasedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction that)) return false;
        return Double.compare(value, that.value) == 0 && Objects.equals(id, that.id) && Objects.equals(purchasedAt, that.purchasedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, purchasedAt);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", value=" + value +
                ", purchasedAt=" + purchasedAt +
                '}';
    }
}
