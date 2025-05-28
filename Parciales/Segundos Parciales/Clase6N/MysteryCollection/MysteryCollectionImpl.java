package Parciales.Segundo.Clase6N.MysteryCollection;

import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Predicate;

public class MysteryCollectionImpl<T extends Comparable<? super T>>extends ArrayList<T> implements MysteryCollection<T> {


    @Override
    public SortedMap<T, Integer> toSortedBag() {
        return toSortedBag((e) -> true);
    }

    @Override
    public SortedMap<T, Integer> toSortedBag(Predicate<T> cmp) {
        SortedMap<T, Integer> bag = new TreeMap<T, Integer>();
        for(T elem : this){
            if (cmp.test(elem)) {
                bag.putIfAbsent(elem, 0);
                bag.put(elem, bag.get(elem) + 1);
            }
        }
        return bag;
    }

}
