package Chapter8.ex2.application;

import Chapter8.ex2.model.Telephone;
import Chapter8.ex2.logic.Charger;

public class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Iphone", "XS", 3400, 75);
        Charger charger = new Charger();
        System.out.println(telephone.getInfo());
        charger.chargeUp(telephone);
        System.out.println(telephone.getInfo());
    }
}
