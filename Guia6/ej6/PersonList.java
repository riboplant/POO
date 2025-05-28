package Guias.Guia6.ej6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonList implements PersonCollection{

    Map<String, Map<String, Person>> map  = new HashMap<>();

    @Override
    public void addPerson(Person aPerson) {
        map.putIfAbsent(aPerson.getLastName(), new HashMap<>());
        map.get(aPerson.getLastName()).put(aPerson.getFirstName(), aPerson);
    }

    @Override
    public List<Person> findByLastName(String lastName) {
        return new ArrayList<>(map.getOrDefault(lastName, new HashMap<>()).values());
    }

    @Override
    public Person findByName(String firstName, String lastName) {
//      return map.getOrDefault(lastName, new HashMap<>()).get(firstName);
        if(!map.containsKey(lastName) || !map.get(lastName).containsKey(firstName))
            return null;
        return map.get(lastName).get(firstName);
    }
}
