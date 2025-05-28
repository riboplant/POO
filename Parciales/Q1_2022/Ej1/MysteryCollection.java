package Parciales.Q1_2022.Ej1;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public interface MysteryCollection<T> extends List<T> {
    Map<T, Integer> toBag(Predicate<T> predicate);
    Map<T, Integer> toBag();


}
