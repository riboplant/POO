package Guias.Guia6.ej8;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class BagImpl<T> implements Bag<T>{
    protected Map<T, Integer> bag = new HashMap<>();
    private int size, difSize;
    @Override
    public void add(T elem) {
        if(bag.containsKey(elem)) {
            bag.put(elem, bag.get(elem) + 1);
        }
        else {
            bag.put(elem, 1);
            difSize++;
        }
        size++;
    }

    @Override
    public int count(T elem) {
        return bag.getOrDefault(elem,0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int sizeDistinct() {
        return difSize;
    }

    @Override
    public boolean contains(T elem) {
        return bag.containsKey(elem) && bag.get(elem) > 0;
    }

    @Override
    public void remove(T elem) {
        if(bag.containsKey(elem)){
            bag.put(elem, bag.get(elem) - 1);
            size--;
            if(bag.get(elem) == 0){
                difSize--;
                bag.remove(elem);
            }
        }
        else{
            throw new NoSuchElementException();
        }
    }
}
