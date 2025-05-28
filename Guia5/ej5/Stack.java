package Guias.Guia5.ej5;

public interface Stack<E> {
    E peek();
    void push(E elem);
    E pop();
    boolean isEmpty();
}
