package Guias.Guia5.ej3.parte1;

import javax.sound.sampled.Line;

public class PrependLinearListImpl<T> implements LinearList<T> {
    private Node first;
    @Override
    public void add(T elem) {
        first = new Node(elem);
    }

    @Override
    public T get(int i) {
        return null;
    }

    @Override
    public void set(int i, T elem) {

    }

    @Override
    public void remove(int i) {

    }

    @Override
    public int indexOf(T elem) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    private class Node<T>{
        private T elem;
        private Node tail;
        public Node(T elem){
            this.elem = elem;
            this.tail = first;
            first = this;
        }

    }

}
