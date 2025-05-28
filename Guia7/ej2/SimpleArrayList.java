package Guias.Guia7.ej2;

import java.util.ArrayList;

public class SimpleArrayList<T> extends ArrayList<T> implements SimpleList<T>{

    @Override
    public <E> E reduce(E accum, Operator<T, E> op){
        E toReturn = accum;
        for(T t : this)
            toReturn = op.reduce(toReturn, t);
        return toReturn;
    }
}
