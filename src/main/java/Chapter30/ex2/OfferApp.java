package Chapter30.ex2;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class OfferApp {
    public static void main(String[] args) {
        try {
            Offer[] offers = OfferReader.readOffers("file.csv");
            Arrays.sort(offers);
            for (Offer offer : offers) {
                System.out.println(offer);
            }

        } catch (FileNotFoundException e){
            System.out.println("Problem z plikiem");
        }
    }
}
