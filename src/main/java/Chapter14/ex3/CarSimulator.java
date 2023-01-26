package Chapter14.ex3;

public class CarSimulator {
    public static void main(String[] args) {
        Car car = new Car(10, true, true, false, false);
        System.out.println("Starting car with fuel, engine is ok, doors and fuel clap are closed");
        car.start();
        System.out.println(car.status());
        System.out.println();

        System.out.println("Opening doors");
        car.setDoorsOpen(true);
        System.out.println(car.status());
        System.out.println();

        System.out.println("running out of fuel");
        car.setFuel(0);
        System.out.println(car.status());

    }


}
