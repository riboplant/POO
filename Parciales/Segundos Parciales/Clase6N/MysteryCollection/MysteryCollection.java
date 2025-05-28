package Parciales.Segundo.Clase6N.MysteryCollection;
import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;
import java.util.function.Predicate;

public interface MysteryCollection <T extends Comparable<? super T>> extends List<T> {

    SortedMap<T, Integer> toSortedBag();
    SortedMap<T, Integer> toSortedBag(Predicate<T> cmp);

}
