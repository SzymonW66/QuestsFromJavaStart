package Chapter33.ex2;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private String place;
    private double price;

    public Product(String place, double price) {
        this.place = place;
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(price, product.price) == 0 && Objects.equals(place, product.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(place, price);
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price, o.price);
    }

    @Override
    public String toString() {
        return place + " " + price;
    }
}
