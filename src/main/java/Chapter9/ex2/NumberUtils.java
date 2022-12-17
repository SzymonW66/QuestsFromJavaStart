package Chapter9.ex2;

public class NumberUtils {
    void compareNumberAndPrint(int number, int compareTo) {
        if (number < compareTo){
            System.out.println("This number is lower than 5000");
        }
        else if (number == compareTo) {
            System.out.println("This number is exaclty 5000");
        }
        else
            System.out.println("This number is higher than 5000");
    }

    void printOddOrEven(int number) {
        if (number % 2 == 0){
            System.out.println("Parzysta");
        }
        else
            System.out.println("Nie parzysta");
    }

    int getFourDigitNumber(int number) {
        if(number == 0){
            return number;
        }

        else if (number / 1000 != 0) {
            return number;
        }

        else if (number / 100 != 0) {
            return number * 10;
        }
        else if (number / 10 != 0)
            return number * 100;
        else
            return number * 1000;
    }


    }

