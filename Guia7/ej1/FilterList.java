package Guias.Guia7.ej1;

import java.util.List;

public interface FilterList<T> extends List<T> {

     List<T> ej1(Criteria<T> c);
}
