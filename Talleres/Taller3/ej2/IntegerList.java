package Talleres.Taller3.ej2;

public interface IntegerList {

    public abstract void add(int element);
    public abstract boolean remove(int index);
    public abstract int contains(int element);
    boolean isEmpty();

    default int size(){
        return -1;
    }

    default boolean removeElement(){
         return remove(1);
    }
    //public abstract int index(Integer n);
    //public abstract boolean hasNext();
    //public abstract IntegerList next(IntegerList L);
}
