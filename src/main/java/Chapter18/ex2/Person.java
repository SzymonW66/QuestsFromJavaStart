package Chapter18.ex2;

public class Person {
    private String name;
    private double strengthOfAttack;
    private double strengthOfDefence;
    private double HP;

    public Person(String name, double strengthOfAttack, double strengthOfDefence, double HP) {
        this.name = name;
        this.strengthOfAttack = strengthOfAttack;
        this.strengthOfDefence = strengthOfDefence;
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStrengthOfAttack() {
        return strengthOfAttack;
    }

    public void setStrengthOfAttack(double strengthOfAttack) {
        this.strengthOfAttack = strengthOfAttack;
    }

    public double getStrengthOfDefence() {
        return strengthOfDefence;
    }

    public void setStrengthOfDefence(int strengthOfDefence) {
        this.strengthOfDefence = strengthOfDefence;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    double totalAttack() {
        return strengthOfAttack;
    }

    double totalDefense() {
        return strengthOfDefence;
    }
}
