package Parciales.PrimerParcial.Q2_2023.ej1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;

public class CustomIndex <T> implements Iterable <T> {
    private final T[] array;
    private final int first, last;
    private UnaryOperator<Integer> function;

    public CustomIndex(T[] array, int first, int last, UnaryOperator<Integer> function){
        if(first >= last)
            throw new IllegalArgumentException("first must be lower than last");

    this.first = first;
    this.last = last;
    this.array = array;
    this.function = function;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int current = first;
            private final UnaryOperator<Integer> nextIndex = function;

            @Override
            public boolean hasNext(){
                return !(current > last);
            }

            @Override
            public T next(){
                if(!hasNext())
                    throw new NoSuchElementException("Theres no next item to iterate");
                T aux = array[current];
                current = nextIndex.apply(current);
                return aux;
            }
        };
    }
    public void setNextIndex(UnaryOperator<Integer> function){
        this.function = function;
    }

}
