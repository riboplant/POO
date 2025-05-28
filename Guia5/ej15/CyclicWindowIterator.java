package Guias.Guia5.ej15;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class CyclicWindowIterator<T> implements Iterator<T[]> {
    private final T[] array;
    private int n, l, index;

    public CyclicWindowIterator(T[] array, int n){
        this.array = array;
        this. n = n;
        this.l = array.length;
    }


    @Override
    public boolean hasNext() {
        return array.length != 0;
    }

    @Override
    public T[] next() {
        if(hasNext()){
            T[] toReturn = (T[]) new Object[n];
            for(int i=0; i < n; i++){
                toReturn[i] = array[ (index + i) % l];
            }
            index++;
            return toReturn;
        }
        else{
            throw new NoSuchElementException();
        }
    }
}
