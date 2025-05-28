package Talleres.Taller4;
public interface List <T>{
    boolean isEmpty();
    void add(T element);
    int contains(T element);
    boolean remove(int index);

    int size();

}
