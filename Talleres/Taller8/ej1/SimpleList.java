package Talleres.Taller8.ej1;

import java.util.List;
import java.util.function.UnaryOperator;


public interface SimpleList<T> extends List<T> {
    SimpleList<T> map(UnaryOperator<T> f);

}
