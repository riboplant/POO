package Guias.Guia3.ej9;
import java.awt.Point;


public class Rectangle extends Figure{
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

}
