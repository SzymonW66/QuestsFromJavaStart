package Chapter12.ex2;

import java.util.Random;

public class CoinFlip {
    public boolean isEagleOrBack(int choose) {
        boolean result = false;
        Random rand = new Random();
        int score = rand.nextInt(2);
        if (score == choose) {
            result = true;
        } else {
            result = false;
        }
        return result;
     }

}
