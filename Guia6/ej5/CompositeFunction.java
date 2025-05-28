package Guias.Guia6.ej5;


import Guias.Guia4.ej2.Function;
import Talleres.Taller4.List;

import java.util.ArrayList;

public class CompositeFunction implements Function{
    private final ArrayList<Function> comp = new ArrayList<>();


    public double evaluate(double x) {
        for(Function f : comp){
            x = f.evaluate(x);
        }
        return x;
    }

    public void addFunction(Function f) {
        comp.add(f);
    }
}
