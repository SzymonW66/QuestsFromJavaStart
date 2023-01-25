package Chapter12.ex1;

public class Calculator {
    public double calculate (double number1, double number2, String operator){
        double result = 0;
        switch (operator) {
            case "+" :
                 result = number1 + number2;
                break;
            case "-" :
                 result = number1 - number2;
                break;
            case "*" :
                 result = number1 * number2;
                break;
            case "/" :
                 result = number1 / number2;
                break;

            default:
                System.out.println("Podany operator nie istnieje");
        }
        return result;
    }
}
