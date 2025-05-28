package Guias.Guia7.ej1;

@FunctionalInterface
public interface Criteria<T> {

    boolean satisfies(T t);
}
