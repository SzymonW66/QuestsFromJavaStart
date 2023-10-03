package Chapter20.ex2;

public enum OrderStatus {
    NEW("Nowe"),
    PAID("Opłacone"),
    SHIPPED("Wysłane"),
    DELIVERED("Dostarczone"),
    CANCELLED("Anulowane");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
