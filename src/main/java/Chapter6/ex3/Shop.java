package Chapter6.ex3;

public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("Apple", "Poland");
        Offer offer1 = new Offer(product1, 100, 5);

        System.out.println(product1.toString());
        System.out.println(offer1.toString());
    }
}
