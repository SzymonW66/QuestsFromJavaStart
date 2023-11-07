package Chapter30.ex2;

public class Offer implements Comparable<Offer>{
    private String city;
    private double price;
    private double area;

    public Offer(String city, double price, double area) {
        this.city = city;
        this.price = price;
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    double getPricePerSqm() {
        return price / area;
    }

    @Override
    public int compareTo(Offer o) {
        return Double.compare(getPricePerSqm(), o.getPricePerSqm());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Offer{");
        sb.append("city='").append(city).append('\'');
        sb.append(", price=").append(price);
        sb.append(", area=").append(area);
        sb.append(", price per SQM ="). append(getPricePerSqm());
        sb.append('}');
        return sb.toString();
    }
}
