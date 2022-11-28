package Chapter6.ex4;

public class TestClass {

    public static void main(String[] args) {
        House house = new House(5000, 3000);
        System.out.println(house.getStatus());
        house.boilWater();
        house.takeShower();
        house.watchTv(6);
        System.out.println(house.getStatus());
    }
}
