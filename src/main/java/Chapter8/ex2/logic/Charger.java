package Chapter8.ex2.logic;

import Chapter8.ex2.model.Telephone;

public class Charger {
    public void chargeUp (Telephone telephone){
        telephone.setChargeLevel(telephone.getChargeLevel() + 1);
    }



}
