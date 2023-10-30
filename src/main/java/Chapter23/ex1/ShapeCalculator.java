package Chapter23.ex1;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeCalculator {
    private Scanner sc = new Scanner(System.in);

    public void closeScanner() {
        sc.close();
    }

    private Rectangle readRectangleData() {
        System.out.println("Podaj informację o prostokącie");
        System.out.println("Podaj długość boku A:");
        double a = sc.nextDouble();
        System.out.println("Podaj długość boku B:");
        double b = sc.nextDouble();

        return new Rectangle(a, b);
    }

    private Circle readCircleData(){
        System.out.println("Podaj informację o kole");
        System.out.println("Podaj długość promienia");
        double r = sc.nextDouble();

        return new Circle(r);
    }

    private Triangle readTriangleData(){
        System.out.println("Podaj informację o trójkącie");
        System.out.println("Podaj długość boku A:");
        double a = sc.nextDouble();
        System.out.println("Podaj długość boku B:");
        double b = sc.nextDouble();
        System.out.println("Podaj długość boku C:");
        double c = sc.nextDouble();
        System.out.println("Podaj wysokość trójkąta");
        double height = sc.nextDouble();

        return new Triangle(a, b, c, height);
    }

    public Shape createShape() {
        int shapeType = sc.nextInt();
        switch (shapeType){
            case Shape.RECTANGLE :
                return readRectangleData();
            case Shape.CIRCLE :
                return readCircleData();
            case Shape.TRIANGLE:
                return readTriangleData();
            default:
                throw new NoSuchElementException();
        }
    }
    public void clearBuffer(){
        sc.nextLine();
    }



}
