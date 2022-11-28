package Chapter6.ex1;

public class Calcualate {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double num1 = 123.00;
        double num2 = 5.5;

        System.out.println(calculator.add(num1, num2));
        System.out.println(calculator.divide(num1, num2));
        System.out.println(calculator.substract(num1, num2));
        System.out.println(calculator.multiply(num1, num2));

    }
}
