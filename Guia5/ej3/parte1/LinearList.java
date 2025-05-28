package Guias.Guia5.ej3.parte1;

//Asi se que los elementos son de x tipo, lo sabe tambien el compiler entonces puedo tratarlos como tales
//Por ejemplo haciendo elem.method() con method especifico de la clase

public interface LinearList<T> {

    /**
     * Agrega un elemento al final de la lista.
     */
    void add(T elem);

    /**
     * Obtiene el i-ésimo elemento de la lista.
     */
    T get(int i);

    /**
     * Modifica el i-ésimo elemento de la lista colocando un nuevo valor.
     */
    void set(int i, T elem);

    /**
     * Elimina el i-ésimo elemento de la lista.
     */
    void remove(int i);

    /**
     * Busca el índice de la primer ocurrencia de un objeto en la lista.
     */
    int indexOf(T elem);

    /**
     * Retorna el tamaño de la lista.
     */
    int size();

}
