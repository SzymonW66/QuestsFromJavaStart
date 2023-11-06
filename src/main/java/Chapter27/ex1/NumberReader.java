package Chapter27.ex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class NumberReader {
    public static void main(String[] args) {
       final String fileName = "file.txt";
        try(
                var fr = new FileReader(fileName);
                var br = new BufferedReader(fr);
                ){
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());
            BigInteger d = new BigInteger(br.readLine());
            BigInteger e = new BigInteger(br.readLine());
            System.out.println("A+B+C = " + (a + b + c));
            System.out.println(d.add(e));
        }catch (FileNotFoundException e){
            System.out.println("Problem z plikiem");
        }catch (IOException e){
            System.out.println("Problem z działaniem programu");
        }

    }
}
