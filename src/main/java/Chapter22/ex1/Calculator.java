package Chapter22.ex1;

public class Calculator {
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MUTIPLY = "*";
    private static final String DIVIDE = "/";

    static double calculate(double a, double b, String operator){
        double result = 0;
        switch (operator){
            case PLUS:
                result = a + b;
                break;
            case MINUS:
                result = a - b;
                break;
            case MUTIPLY:
                result = a * b;
                break;
            case DIVIDE:
                if (b == 0){
                    throw new ArithmeticException("Nie możesz dzielić przez 0");
                }
                result = a/b;
                break;
            default:
                throw new UnknownOperatorException("Wykorzystujesz niezdefiniowany opereator arytmetyczny");
        }
        return result;
    }
}
