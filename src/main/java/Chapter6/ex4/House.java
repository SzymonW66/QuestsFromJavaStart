package Chapter6.ex4;

public class House {
    double water;
    double oil;

    public House(double water, double oil) {
        this.water = water;
        this.oil = oil;
    }

   void takeShower () {
       water = water - 48;
    }

   void takeBath() {
        water = water - 86;
   }

   void makeDinner() {
        water = water - 4l;
        oil = oil - 0.1;
   }

   void boilWater() {
        water = water - 0.5;
        oil = oil - 0.01;
   }

   void watchTv(double hours) {
        oil = oil - (hours * 0.06);
   }

   String getStatus () {
        return "Amount of water in reserved " + water + " Amount of oil in reserved " + oil;
   }




}
