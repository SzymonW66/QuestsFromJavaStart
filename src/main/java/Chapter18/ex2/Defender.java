package Chapter18.ex2;

public class Defender extends Person {
    private double defenceBonus;

    public Defender(String name, int strengthOfAttack, int strengthOfDefence, int HP, double defenceBonus) {
        super(name, strengthOfAttack, strengthOfDefence, HP);
        this.defenceBonus = defenceBonus;
    }

    public double getDefenceBonus() {
        return defenceBonus;
    }

    public void setDefenceBonus(double defenceBonus) {
        this.defenceBonus = defenceBonus;
    }

    @Override
    double totalDefense() {
        return getStrengthOfDefence() + defenceBonus * getStrengthOfDefence();
    }
}
