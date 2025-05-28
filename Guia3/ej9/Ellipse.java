package Guias.Guia3.ej9;

import Talleres.Taller2.ej1.Pais;

import java.awt.*;
import java.lang.Math;

public class Ellipse extends Figure{
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

}
