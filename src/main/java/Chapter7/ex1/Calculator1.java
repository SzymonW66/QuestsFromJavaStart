package Chapter7.ex1;

public class Calculator1 {
   public double add (double a, double b) {
       return a + b;
   }
    public double add (double a, double b, double c) {
        return add(a, b) + c;
    }

    double substract (double a, double b) {
       return a - b;
    }
    double substract (double a, double b, double c) {
        return substract(a, b) - c;

    }




}
