package Guias.Guia7.ej2;

import java.util.List;
import java.util.function.BinaryOperator;

public interface SimpleList<T> extends List<T>{

     <E> E reduce(E accum, Operator<T, E> op);
}
