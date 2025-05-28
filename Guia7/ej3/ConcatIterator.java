package Guias.Guia7.ej3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ConcatIterator<T> implements Iterator<T> {

    private Iterator<T> it1, it2, current;

    public ConcatIterator(Iterator<T> it1, Iterator<T> it2) {
        this.it1 = it1;
        this.it2 = it2;
        this.current = it1;
    }

    @Override
    public boolean hasNext(){
        if(!current.hasNext()){
            if(current == it1)
                current = it2;
        }
        return current.hasNext();

    }

    @Override
    public T next(){
        if(!hasNext())
            throw new NoSuchElementException();
        return current.next();

    }

}
