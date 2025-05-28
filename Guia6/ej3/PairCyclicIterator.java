package Guias.Guia6.ej3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PairCyclicIterator<T> implements Iterator<Pair<T>> {

    private final Iterable<T> collection;
    private Iterator<T> iterator;

    public PairCyclicIterator(Iterable<T> collection){
        this.collection = collection;
        this.iterator = collection.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.collection.iterator().hasNext();
    }

    @Override
    public Pair<T> next() {
        if(!hasNext())
            throw new NoSuchElementException();
        T one, two;
        if(!iterator.hasNext())
            iterator = collection.iterator();
        one = iterator.next();
        if(!iterator.hasNext())
            iterator = collection.iterator();
        two = iterator.next();
        return new Pair<>(one, two);
    }
}
