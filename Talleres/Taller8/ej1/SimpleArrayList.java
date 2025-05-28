package Talleres.Taller8.ej1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;

public class SimpleArrayList<T> extends ArrayList<T> implements SimpleList<T>{
    @Override
    public SimpleList<T> map(UnaryOperator<T> f){
        SimpleList<T> toReturn = new SimpleArrayList<T>();
        for(T elem: this){
            toReturn.add(f.apply(elem));
        }
        return toReturn;
    }

}
