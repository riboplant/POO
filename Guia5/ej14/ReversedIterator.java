package Guias.Guia5.ej14;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReversedIterator<T> implements Iterator<T> {
    private int i;
    private final T[] array;

    public ReversedIterator(T[] array){
        this.array = array;
        this.i = array.length - 1;
    }

    @Override
    public boolean hasNext() {
        return i >= 0;
    }

    @Override
    public T next() {
        if(hasNext()) {
            T toReturn = array[i];
            i--;
            return toReturn;
        }
        else throw new NoSuchElementException();
    }
}
