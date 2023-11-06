package Chapter27.ex2;

import java.util.Scanner;

public class WordStatistic {
    public static void main(String[] args) {
        String word = readWordFromUser();
        int digit = countDigits(word);
        System.out.println("Liczba cyfr w tekście" + digit);
        int letters = countLetters(word);
        System.out.println("Liczba liter w tekście" + letters);
        try {
            int biggestDigitInText = findBiggestDigitInText(word);
            System.out.println("Największa cyfra w tekście to " + biggestDigitInText);
        } catch (DigitNotFoundException e){
            System.out.println("Nie znaleziono takiej liczby");
        }
    }

    private static int findBiggestDigitInText(String word) {
       char [] chars = word.toCharArray();
       final int notFound = -1;
       int biggestNumber = notFound;
        for (char aChar : chars) {
            if(Character.isDigit(aChar)){
            int digit = Character.getNumericValue(aChar);
            biggestNumber = Integer.max(biggestNumber, digit);
        }
    }
        if(biggestNumber == notFound){
            throw new DigitNotFoundException();
        }
        return biggestNumber;
    }


    private static int countLetters(String word) {
        char[] chars = word.toCharArray();
        int letters = 0;
        for (char aChar : chars) {
            if (Character.isLetter(aChar)) {
                letters++;
            }
        }
        return letters;

    }

    private static int countDigits(String word) {
        char[] chars = word.toCharArray();
        int digits = 0;
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                digits++;
            }
        }
        return digits;
    }

    private static String readWordFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
