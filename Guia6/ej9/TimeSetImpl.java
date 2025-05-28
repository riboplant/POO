package Guias.Guia6.ej9;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TimeSetImpl <T> implements TimeSet<T> {
    private final Set<ItemTime<T>> set = new TreeSet<>(Comparator.<ItemTime<T>>comparingInt(ItemTime :: getHours).thenComparingInt(ItemTime::getMinutes));

    @Override
    public void add(T elem, int hours, int minutes) {
        ItemTime<T> toInsert = new ItemTime<>(elem, hours, minutes);
        set.add(toInsert);
    }

    @Override
    public void remove(T elem) {
        set.remove(set.remove(elem));
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean contains(T elem) {
        return set.contains(elem);
    }

    @Override
    public Set<T> retrieve(int hoursFrom, int minutesFrom, int hoursTo, int minutesTo) {
        Set<T> toReturn = new HashSet<>();
        for(ItemTime<T> i : set){
            if( i.getHours() > hoursTo)
                break;
            if(i.isBetween(hoursFrom, minutesFrom, hoursTo, minutesTo))
                toReturn.add(i.getName());
        }
        return toReturn;
    }
}
