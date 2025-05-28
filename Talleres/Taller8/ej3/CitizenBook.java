package Talleres.Taller8.ej3;

import java.util.Map;
import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class CitizenBook {
    private Map<String, SortedSet<Citizen>> map = new HashMap<>();

    public void add(Citizen c){
        map.putIfAbsent(c.getLastName(), new TreeSet<>());
        map.get(c.getLastName()).add(c);
    }


    public SortedSet<Citizen> getByLastName(String lastName){
        if(map.containsKey(lastName))
            return map.get(lastName);
        else {
            return new TreeSet<Citizen>();
        }
    }
}
