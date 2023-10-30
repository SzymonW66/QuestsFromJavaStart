package Chapter23.ex1;

public class Circle implements Shape{
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calcualteArea() {
        return Shape.Pi * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return 2* Shape.Pi * r;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("Koło, ");
        sb.append("promień: " + r + ", ");
        sb.append("pole: " + calcualteArea() + ", ");
        sb.append("obwód: " + calculatePerimeter());
        return sb.toString();
    }
}
