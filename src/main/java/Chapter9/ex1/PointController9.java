package Chapter9.ex1;

import Chapter9.ex1.Point9;

public class PointController9 {
    public void addX(Point9 point) {
        point.setX(point.getX() + 1);
    }

    public void addY (Point9 point) {
        point.setY(point.getY() + 1);
    }

    public void minusX(Point9 point){
        point.setX(point.getX() - 1);
    }

    public void minusY(Point9 point) {
        point.setY(point.getY() - 1);
    }
}
