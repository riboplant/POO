package Guias.Guia4.ej3;

import java.awt.*;

public class Ellipse extends Figure {
    protected final Point center;
    protected final double xAxisRadius;
    protected final double yAxisRadius;

    public Ellipse(Point center, double xAxisRadius, double yAxisRadius) {
        this.center = center;
        this.xAxisRadius = xAxisRadius;
        this.yAxisRadius = yAxisRadius;
    }

    public double area(){
        return 3.1416 * xAxisRadius * yAxisRadius / 4;
    }

    public double perimeter(){
        return 3.1416 * (xAxisRadius + yAxisRadius) / 2;
    }
    @Override
    public String toString() {
        return "Elipse [Centro: %s, DMayor: %.2f, DMenor: %.2f]".formatted(center, xAxisRadius, yAxisRadius);
    }

    @Override
    public void moveNorth(double delta) {
        center.move(0, (int)delta);
    }

    @Override
    public void moveSouth(double delta) {
        center.move(0, -(int)delta);
    }

    @Override
    public void moveWest(double delta) {
        center.move(0, (int)delta );
    }

    @Override
    public void moveEast(double delta) {
        center.move(0, -(int)delta );
    }
}
