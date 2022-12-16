package Chapter8.ex1.app;

import Chapter8.ex1.controller.PointController;
import Chapter8.ex1.data.Point;

public class PointAplication {
    public static void main(String[] args) {
        Point point = new Point(0, 0);
        PointController pc = new PointController();
        System.out.println("Point numbers: " + point.getX() + " " + point.getY());
        pc.addX(point);
        System.out.println("Point numbers: " + point.getX() + " " + point.getY());
        pc.addY(point);
        System.out.println("Point numbers: " + point.getX() + " " + point.getY());
        pc.addX(point);
        System.out.println("Point numbers: " + point.getX() + " " + point.getY());
        pc.minusY(point);
        System.out.println("Point numbers: " + point.getX() + " " + point.getY());
        pc.minusY(point);
        System.out.println("Point numbers: " + point.getX() + " " + point.getY());
    }
}
