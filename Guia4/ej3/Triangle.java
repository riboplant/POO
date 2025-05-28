package Guias.Guia4.ej3;

import java.awt.*;

public class Triangle extends Figure {
    private final Point p1;
    private final Point p2;
    private final Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public double perimeter() {
        return side1() + side2() + side3();
    }

    public double area(){
        double semiperimeter = perimeter() / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - side1()) * (semiperimeter - side2()) * (semiperimeter - side3()));
    }
    private double side1(){
        return p1.distance(p2);
    }
    private double side2(){
        return p2.distance(p3);
    }
    private double side3(){
        return p3.distance(p1);
    }

    @Override
    public String toString() {
        return "Triángulo [ %s , %s , %s ]".formatted(p1, p2, p3);
    }

    @Override
    public void moveNorth(double delta) {
        p1.move(0,(int)delta);
        p2.move(0,(int)delta);
        p3.move(0,(int)delta);
    }

    @Override
    public void moveSouth(double delta) {
        p1.move(0,-(int)delta);
        p2.move(0,-(int)delta);
        p3.move(0,-(int)delta);
    }

    @Override
    public void moveWest(double delta) {
        p3.move((int)delta, 0);
        p1.move((int)delta, 0);
        p2.move((int)delta, 0);
    }

    @Override
    public void moveEast(double delta) {
        p3.move(-(int)delta, 0);
        p1.move(-(int)delta, 0);
        p2.move(-(int)delta, 0);
    }
}
