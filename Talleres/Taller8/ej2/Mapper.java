package Talleres.Taller8.ej2;
@FunctionalInterface
public interface Mapper<T, V> {
    V map(T valueIn);
}
