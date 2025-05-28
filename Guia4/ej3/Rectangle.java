package Guias.Guia4.ej3;

import java.awt.*;


public class Rectangle extends Figure {
    private final Point p1;
    private final Point p2;

    public Rectangle(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public double perimeter() {
        return 2 * (base() + height());
    }

    public double area(){
        return base() * height();
    }
    public double base(){
        return ((p2.x - p1.x) >= 0) ? p2.x-p1.x : p1.x-p2.x;
    }
    public double height(){
        return ((p2.y - p1.y) >= 0) ? p2.y-p1.y : p1.y-p2.y;
    }
    @Override
    public String toString() {
        return "Rectángulo [ %s , %s ]".formatted(p1, p2);
    }


    @Override
    public void moveNorth(double delta) {
        p1.move(0, (int)delta);
        p2.move(0, (int)delta);
    }

    @Override
    public void moveSouth(double delta) {
        p1.move(0, -(int)delta);
        p2.move(0, -(int)delta);
    }

    @Override
    public void moveWest(double delta) {
        p1.move((int)delta, 0);
        p2.move((int)delta, 0);
    }

    @Override
    public void moveEast(double delta) {
        p1.move(-(int)delta, 0);
        p2.move(-(int)delta, 0);
    }
}
