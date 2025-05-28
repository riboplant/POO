package Guias.Guia7.ej7;

public class MyComparableClass implements Comparable<MyComparableClass> {
    private String e;
    public String sortableIdentifier;
    public MyComparableClass(String s){
        this.e = s;
    }

    @Override
    public int compareTo(MyComparableClass o) {
        return e.compareTo(o.e);
    }

    public String getKey(){
        return e + " - (" +sortableIdentifier + ")";
    }

    public String toString(){
        return getKey();
    }
}
