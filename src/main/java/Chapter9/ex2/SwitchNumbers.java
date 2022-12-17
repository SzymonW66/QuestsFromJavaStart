package Chapter9.ex2;

import java.util.Random;

public class SwitchNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10000);
        System.out.println("Drawn number " + number);

        NumberUtils numberUtils = new NumberUtils();
        numberUtils.compareNumberAndPrint(number, 5000);
        numberUtils.printOddOrEven(number);
        System.out.println("Uzupełniona do 4 cyfr: " + numberUtils.getFourDigitNumber(number));
    }
}



