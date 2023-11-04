package Chapter26.ex2;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addProduct(new Product("meleko", 1));
        cart.addProduct(new Product("czekolada", 2));
        cart.addProduct(new Product("jogurt", 3));

        double cartCost = cart.totalCost2();
        System.out.println("Koszt koszyka " + cartCost + "zł");
    }
}
