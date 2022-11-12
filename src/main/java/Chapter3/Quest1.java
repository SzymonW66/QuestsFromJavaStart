package Chapter3;

import java.util.Random;

public class Quest1 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(10);
        int y = random.nextInt(30);
        boolean result;

        System.out.println(x);
        System.out.println(y);
        System.out.println("IS X > Y?");
        if (x > y) {
            result = true;

            System.out.println(result);
        }
        else {
            result = false;
        }
        System.out.println(result);

        System.out.println("IS x/2 < y?");
        if (x/2 < y) {
            result = true;

        }
        else{
            result = false;
        }
        System.out.println(result);

        System.out.println("IS y < x+3 && y > x-2?");
        if (y < x+3 && y > x-2){
            result = true;

        }
        else{
            result = false;
        }
        System.out.println(result);

        System.out.println("IS (x*y) % 2 == 0?");
        if((x*y) % 2 == 0) {
            result = true;

        }
        else {
            result = false;
        }
        System.out.println(result);




    }
}
