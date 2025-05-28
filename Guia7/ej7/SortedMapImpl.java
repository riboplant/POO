package Guias.Guia7.ej7;

import java.util.*;

public class SortedMapImpl<K extends Comparable<? super K>,V> extends TreeMap<K, V> implements SortedMap<K,V> {
    @Override
    public K firstKey() {
        return firstNode().getKey();
    }

    @Override
    public V firstValue() {
        return firstNode().getValue();
    }


    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return entrySet().iterator();
    }

    protected Map.Entry<K, V> firstNode(){
        return iterator().next();
    }
}
