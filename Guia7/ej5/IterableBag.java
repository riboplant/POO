package Guias.Guia7.ej5;

import Guias.Guia6.ej8.Bag;

public interface IterableBag<E extends Comparable<? super E>> extends Bag<E> {
    /**
     * Para iterar, en orden descendente, por todos los elementos que hay en la bolsa.
     */
    Iterable<E> elements();

    /**
     * Para iterar, en orden descendente, por todos los elementos distintos
     * que hay en la bolsa.
     */
    Iterable<E> elementsDistinct();


}
