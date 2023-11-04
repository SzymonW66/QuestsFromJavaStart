package Chapter26.ex1;

public class Factorial {
    public static void main(String[] args) {
        int factArg = 5;
        int result = factorial(factArg);
        System.out.println("Silnia " + factArg + "=" + result);
    }

    private static int factorial(int n) {
        return n > 1 ? n * factorial(n -1) : 1;
    }
}
