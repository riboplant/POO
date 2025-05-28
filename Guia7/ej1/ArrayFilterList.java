package Guias.Guia7.ej1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayFilterList<T> extends ArrayList<T> implements FilterList<T>{
    @Override
    public List<T> ej1(Criteria<T> c){
        List<T> newList = new ArrayList<T>();
        Iterator<T> it = this.iterator();
        for(T t : this){
            if(c.satisfies(t)){
                newList.add(t);
            }
        }
        return newList;
    }
}
