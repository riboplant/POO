package Talleres.Taller8.ej3;

public class Citizen implements Comparable<Citizen>{
    private final String Firstame, lastName;
    private final int id;

    public Citizen(int id, String lastName, String firstame){
        this.Firstame = firstame;
        this.lastName = lastName;
        this.id = id;
    }
    public String getLastName(){
        return lastName;
    }

    @Override
    public int compareTo(Citizen o) {
        return Integer.compare(this.id, o.id);
    }
}
