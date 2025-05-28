package Guias.Guia5.ej6;

import Guias.Guia5.ej5.Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class AccessStack<E> implements Stack<E> {
    private static final int START_DIM = 1;
    private E array[];
    int size;
    int pushTimes, popTimes;

    @SuppressWarnings("Unchecked")
    public AccessStack(){
    array = (E[]) new Object[START_DIM];
}

    @Override
    public void push(E elem) {
        size++;
        resize();
        array[size - 1] = elem;
        pushTimes++;
    }

    @Override
    public E peek() {
        if(isEmpty())
            throw new EmptyStackException();

        return array[size-1];
    }

    @Override
    public E pop() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        E ans = array[size - 1];
        size--;
        resize();
        popTimes++;
        return ans;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void resize(){
        array = Arrays.copyOf(array, size);
    }

    @Override
    public String toString(){
        String ans = "[ ";
        for(E elem : array){
            ans += elem + ", ";
        }
        return ans + " ]";
    }
    public int getPopTimes(){
        return popTimes;
    }
    public int getPushTimes(){
        return pushTimes;
    }
}
