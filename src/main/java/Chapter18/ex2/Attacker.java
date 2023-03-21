package Chapter18.ex2;

public class Attacker extends Person {
    private double attackBonus;

    public Attacker(String name, double strengthOfAttack, double strengthOfDefence, double HP, double attackBonus) {
        super(name, strengthOfAttack, strengthOfDefence, HP);
        this.attackBonus = attackBonus;
    }

    @Override
    double totalAttack() {
        return getStrengthOfAttack() + attackBonus * getStrengthOfAttack();
    }

    public double getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(double attackBonus) {
        this.attackBonus = attackBonus;
    }
}
