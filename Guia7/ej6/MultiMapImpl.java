package Guias.Guia7.ej6;

import java.util.*;

public class MultiMapImpl<K, V extends Comparable<? super V>> implements MultiMap<K, V>{
    private final Map<K, Set<V>> map = new HashMap<>();
    @Override
    public void put(K key, V value) {
        map.putIfAbsent(key, new TreeSet<>());
        map.get(key).add(value);
    }

    @Override
    public int size() {
        int tot = 0;
        for( Set<V> v : map.values() )
            tot += v.size();
        return tot;
    }

    @Override
    public int size(K key) {
        Set<V> v = map.getOrDefault(key, null);
        return ( v == null) ? 0 : v.size();
    }

    @Override
    public void remove(K key) {
        map.remove(key);
    }

    @Override
    public void remove(K key, V value) {
        Set<V> v = map.get(key);
        if(v != null)
            v.remove(value);
    }

    @Override
    public Iterable<V> get(K key) {
        return map.get(key);
    }
}
