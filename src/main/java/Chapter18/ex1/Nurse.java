package Chapter18.ex1;

public class Nurse extends Person {
    private int overshifts;

    public Nurse(String name, String lastName, double salary, int overshifts) {
        super(name, lastName, salary);
        this.overshifts = overshifts;
    }

    public int getOvershifts() {
        return overshifts;
    }

    public void setOvershifts(int overshifts) {
        this.overshifts = overshifts;
    }

    @Override
    public String toString() {
        return super.toString()  +
                "overshifts=" + overshifts +
                '}';
    }
}
