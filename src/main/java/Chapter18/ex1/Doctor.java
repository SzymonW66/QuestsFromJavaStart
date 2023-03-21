package Chapter18.ex1;

public class Doctor extends Person {
    private double bouns;

    public Doctor(String name, String lastName, double salary, double bouns) {
        super(name, lastName, salary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public String toString() {
        return super.toString() + "Doctor{" +
                "bouns=" + bouns +
                '}';
    }
}
