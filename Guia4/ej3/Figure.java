package Guias.Guia4.ej3;

public abstract class Figure implements Movable {
    public abstract double perimeter();
    public abstract double area();
    //public abstract boolean belongs(Point2D.Double p);


    public abstract void moveNorth(double delta);

    public abstract void moveSouth(double delta);

    public abstract void moveWest(double delta);

    public abstract void moveEast(double delta);
}
