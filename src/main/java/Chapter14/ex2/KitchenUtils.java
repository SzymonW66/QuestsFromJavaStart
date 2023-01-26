package Chapter14.ex2;

public class KitchenUtils {
    static final double GLASS_TO_ML = 250.00;
    static final double SPOON_TO_ML = 15.00;
    static final double LITTLE_SPOON_TO_ML = 5.00;

    static double glassesToMl (double glasses) {
         return glasses * GLASS_TO_ML;
    }

    static double spoonsToMl (double spoons) {
         return spoons * SPOON_TO_ML;
    }

    static double littleSpoonsToMl (double littleSpoons) {
         return littleSpoons * LITTLE_SPOON_TO_ML;
    }


}
