package Talleres.Taller4;

public class IntegerArrayList implements List<Integer> {
    private int size;
    private Integer[] array;


    @Override
    public void add(Integer elem) {
        Integer[] n = new Integer[size + 1];
        System.arraycopy(this.array, 0, n, 0, size);
        n[size] = elem;
        size++;
        this.array = n;
    }

    @Override
    public boolean remove(int index) {
        if(index >= size)
            return false;

        array[index - 1] = null;
        return true;
    }

    @Override
    public int contains(Integer element) {
        for(Integer o : array){
            if(array.equals(element))
                return 1;
        }
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    public IntegerArrayList(){
        this.array = new Integer[size];
    }
    public int size(){
        return size;
    }
    @Override
    public String toString(){
        String a = "";
        for(Integer o : array){
            a += o + " ";
        }
        return a;
    }
}
