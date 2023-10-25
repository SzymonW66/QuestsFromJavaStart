package Chapter21.ex2;

import java.util.Random;

public class Dice {
    private final static Random random = new Random();
    private final static String[] SIDES = {
            """
             - - - - -
            |         |
            |    0    |
            |         |
             - - - - -
            """,
            """
             - - - - -
            |       0 |
            |         |
            | 0       |
             - - - - -
            """,
            """
             - - - - -
            |       0 |
            |    0    |
            | 0       |
             - - - - -
            """,
            """
             - - - - -
            | 0     0 |
            |         |
            | 0     0 |
             - - - - -
            """,
            """
             - - - - -
            | 0     0 |
            |    0    |
            | 0     0 |
             - - - - -
            """,
            """
             - - - - -
            | 0  0  0 |
            |         |
            | 0  0  0 |
             - - - - -
            """
    };

    static String roll() {
        int side = random.nextInt(SIDES.length);
        return SIDES[side];
    }
}
