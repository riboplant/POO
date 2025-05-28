package Parciales.R_1Q_2022.Ejercicio2;


import java.util.*;


public class AbstractSearch {
    private final String name;
    private SortedSet<Results> searchs;
    public AbstractSearch(String name, Comparator<Results> comparator){
        this.name = name;
        searchs = new TreeSet<>(comparator);
    }

    public void addSearchResult(String destinyAirport, int stops, String airline, SeatCategory seatCategory) {
        searchs.add(new Results(destinyAirport, stops, airline, seatCategory));
    }

    public Iterator<Results> resultsIterator(){
        return new Iterator<Results>() {
            private final Iterator<Results> resultsIterator = searchs.iterator();

            @Override
            public boolean hasNext() {
                return resultsIterator.hasNext();
            }

            @Override
            public Results next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Results element = resultsIterator.next();
                return element;
            }
        };
    }

}
