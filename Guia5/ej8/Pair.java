package Guias.Guia5.ej8;

import java.util.Comparator;

public class Pair<T extends Comparable<? super T>, E extends Comparable<? super E>> implements Comparable<Pair<E,T>>{
    private T t;
    private E e;

    public Pair(T t, E e){
        this.t = t;
        this.e = e;
    }



    @Override
    public String toString(){
        return "[" + t.toString() + ", " + e.toString() + "]";
    }


    @Override
    public int compareTo(Pair<E, T> o) {
        int ans = o.t.compareTo(e);
        if(ans == 0){
            ans = o.e.compareTo(t);
        }
        return ans;
    }
}
