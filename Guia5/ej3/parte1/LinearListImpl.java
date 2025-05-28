package Guias.Guia5.ej3.parte1;

public class LinearListImpl <T> implements LinearList<T>{
    @Override
    public void add(Object elem) {

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


    private static class Node<T> {

        private T head;
        private Node tail;

        Node(T head, Node tail) {
            this.head = head;
            this.tail = tail;
        }

    }

}
