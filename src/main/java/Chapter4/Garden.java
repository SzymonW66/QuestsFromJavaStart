package Chapter4;

public class Garden {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Plant plant2 = new Plant();
        plant1.name = "qwert";
        plant1.description = "big and yellow";
        plant1.waterUsage = 10;

        plant2.name = "trewq";
        plant2.description = "small and blue";
        plant2.waterUsage = 5;

        int dailyWater = DailyWaterUsage(plant1, plant2);
        int weekWater = WeeklyWaterUsage(plant1, plant2);
        int yearWater = YearWaterUsage(plant1, plant2);

        System.out.println(dailyWater);
        System.out.println(weekWater);
        System.out.println(yearWater);

    }

    static int DailyWaterUsage(Plant plant, Plant plant2){
       return plant.waterUsage + plant2.waterUsage;
    }

    static int WeeklyWaterUsage (Plant plant1, Plant plant2){
        return 7* DailyWaterUsage(plant1, plant2);
    }

   static int YearWaterUsage (Plant plant, Plant plant2){
        return 365 * DailyWaterUsage(plant, plant2);
    }



}
