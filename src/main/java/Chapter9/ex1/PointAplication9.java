package Chapter9.ex1;

public class PointAplication9 {
    public static void main(String[] args) {
        Point9 point9 = new Point9(1,1);
        PointController9 pc = new PointController9();
        final int addX = 0;
        final int addY = 1;
        final int minusX = 2;
        final int minusY = 3;

        int option = addY;
        switch (option) {
            case addX:
                pc.addX(point9);
                break;
            case addY:
                pc.addY(point9);
                break;
            case minusX:
                pc.minusX(point9);
                break;
            case minusY:
                pc.minusY(point9);
                break;
            default:
                System.out.println("Something went wrong");
        }
        System.out.println("Punkt po zmianie: (" + point9.getX() + ";" + point9.getY() + ")");
    }




}
