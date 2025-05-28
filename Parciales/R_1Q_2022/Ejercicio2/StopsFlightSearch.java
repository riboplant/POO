package Parciales.R_1Q_2022.Ejercicio2;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class StopsFlightSearch {
    private final String name;
    private Set<Results> searchs;
    public StopsFlightSearch(String name){
        this.name = name;
        searchs = new TreeSet<>();
    }

    @Override
    public String toString(){
        return String.format("Flight Search for %s with %d results.", name, searchs);
    }

}
