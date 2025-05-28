package Talleres.Taller8.ej2;

import java.util.List;
import java.util.function.UnaryOperator;


public interface SimpleList<T> extends List<T> {
    <V> SimpleList<V> map(Mapper<T, V> mapper);
}
