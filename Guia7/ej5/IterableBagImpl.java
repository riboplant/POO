package Guias.Guia7.ej5;

import Guias.Guia6.ej8.BagImpl;

import java.util.*;

public class IterableBagImpl<E extends Comparable<? super E>> extends BagImpl<E> implements IterableBag<E> {

    public IterableBagImpl(){
        bag = new TreeMap<>(Comparator.reverseOrder());
    }
    @Override
    public Iterable<E> elements() {
        List<E> elements = new ArrayList<>();
        for(Map.Entry<E, Integer> entry : bag.entrySet()) {
            for(int i = 0; i < entry.getValue(); i++) {
                elements.add(entry.getKey());
            }
        }
        return elements;

    }

    @Override
    public Iterable<E> elementsDistinct() {
        return bag.keySet();
    }
}
