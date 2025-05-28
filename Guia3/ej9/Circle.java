package Guias.Guia3.ej9;

import java.awt.*;

public class Circle extends Ellipse{
    public Circle(Point center, double radius){
        super(center, 2*radius, 2*radius);
    }
    @Override
    public String toString() {
        return "Círculo [Centro: %s , Radio: %.2f}]".formatted(center, xAxisRadius);
    }

}
