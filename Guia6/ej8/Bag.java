package Guias.Guia6.ej8;

public interface Bag<T> {
    void add(T elem);

    int count(T elem);

    int size();

    int sizeDistinct();

    boolean contains(T elem);

    void remove(T elem);
}
