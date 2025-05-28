package Parciales.Q1_2023.Ej3;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PartitionableColecction<T> extends ArrayList<T> {


    public PartitionableColecction<T> getRejected(Predicate<T> p){
        return getSelected(p.negate());
    }


    private PartitionableColecction<T> getSelected(Predicate<T> p){
        PartitionableColecction<T> toReturn = new PartitionableColecction<>();
        for(T elem : this){
            if(p.test(elem)){
                toReturn.add(elem);
            }
        }
        return toReturn;
    }


}
