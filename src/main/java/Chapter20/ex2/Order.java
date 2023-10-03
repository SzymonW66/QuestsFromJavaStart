package Chapter20.ex2;

public class Order {
    private  String item;
    private double price;
    private OrderStatus status;

    public Order(String item, double price, OrderStatus status) {
        this.item = item;
        this.price = price;
        this.status = status;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return item + " (" + price + " zł)"  + status;
    }
}
