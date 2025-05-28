package Talleres.Taller8.ej2;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class SimpleArrayList<T> extends ArrayList<T> implements SimpleList<T> {
    @Override
    public <V> SimpleList<V> map(Mapper<T,V> mapper){
        SimpleList<V> toReturn = new SimpleArrayList();
        for(T elem: this){
            toReturn.add(mapper.map(elem));
        }
        return toReturn;
    }
    
}
