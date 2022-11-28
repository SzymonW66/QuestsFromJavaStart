package Chapter6.ex3;

public class Offer {
    Product product;
    double price;
    double special;

    Offer (Product product, double price, double special) {
        this.product = product;
        this.price = price;
        this.special = special;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "product=" + product +
                ", price=" + price +
                ", special=" + special +
                '}';
    }
}
