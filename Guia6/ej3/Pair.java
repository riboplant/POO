package Guias.Guia6.ej3;

public class Pair <E>{
    private final E one, two;
    public Pair(E one, E two){
        this.one = one;
        this.two = two;
    }
    @Override
    public String toString(){
        return "# " + one + " + " + two + " #";
    }
}
