package Chapter3;

public class Quest2 {
    public static void main(String[] args) {
        double netPrice = 1000;
        final double vat = 0.23;
        double vatAmount = 1000 * vat;
        double grossPrice = netPrice + vatAmount;
        System.out.println(grossPrice);
    }
}
