package Chapter26.ex2;

public class Cart {
    private static final int MAX_PRODUCTS = 10;
    private Product[] products = new Product[MAX_PRODUCTS];
    private int productsCount;

    void addProduct(Product product) {
        if (productsCount < MAX_PRODUCTS) {
            products[productsCount] = product;
            productsCount++;
        }
    }

    double totalCost1() {
        double totalPrice = 0;
        for (int i = 0; i < productsCount; i++) {
            totalPrice += products[i].getPrice();
        }
        return totalPrice;
    }

    double totalCost2() {
        return sumPrices(0);

    }

    private double sumPrices(int counter) {
        if (counter < (productsCount - 1))
            return products[counter].getPrice() + sumPrices(++counter);

        else
            return products[counter].getPrice();
    }
}
