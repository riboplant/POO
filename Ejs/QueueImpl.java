package Ejs;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class QueueImpl<E> implements Queue<E>, Iterable<E> {
    private Node<E> first, last;


    public QueueImpl() {
        first = null;
    }

    @Override
    public void enqueue(E elem) {
        Node<E> newFirst = new Node(elem);
        if(isEmpty()) {
            last = first = newFirst;
        }
        else{
            last.tail = newFirst;
            last = newFirst;
        }
    }

    @Override
    public E dequeue() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        E current = first.element;
        first = first.tail;
        return current;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            private Node<E> current = first;

            @Override
            public boolean hasNext() {
                return !(current == null);
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                E ans = current.element;

                current = current.tail;
                return ans;
            }
        };

    }

    private static class Node<E> {
        E element;
        Node<E> tail;

        public Node(E element) {
            this.element = element;
        }
    }


}
