package Chapter7.ex2;

import java.util.Random;

public class Dice {
    int rollUp;

    public Dice() {
        roll();
    }

    public Dice (int rollUp) {
        this.rollUp = rollUp;
    }

    void roll() {
        Random random1 = new Random();
        rollUp = random1.nextInt(6) + 1;
    }

    void printInfo () {
        System.out.println("Liczba oczek na kostce: " + rollUp);
    }
}
