package Parciales.Q1_2022.Ej1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class MysteryCollectionImpl<T> extends ArrayList<T> implements MysteryCollection<T> {

    @Override
    public Map<T, Integer> toBag(Predicate<T> predicate){
        Map<T, Integer> bag = new HashMap<>();
        for(T elem : this){
            if(predicate.test(elem)){
                bag.putIfAbsent(elem, 0);
                bag.put(elem, bag.get(elem) + 1);
            }
        }
        return bag;
    }


    @Override
    public Map<T, Integer> toBag(){
        return toBag((e) -> true);
    }


}
