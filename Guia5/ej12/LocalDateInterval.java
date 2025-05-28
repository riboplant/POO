package Guias.Guia5.ej12;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LocalDateInterval implements Iterable<LocalDate>{
    private LocalDate start, end;
    private int it;

    protected LocalDateInterval(LocalDate start, LocalDate end, int it) {
        this.start = start;
        this.end = end;
        this.it = it;
    }


    @Override
    public Iterator<LocalDate> iterator() {
        return new Iterator<LocalDate>() {
            LocalDate current = start;
            @Override
            public boolean hasNext() {
                return !current.isAfter(end);
            }

            @Override
            public LocalDate next() {
                if (hasNext()) {
                    LocalDate ans = current;
                    current = current.plusDays(it);
                    return ans;
                }
                else throw new NoSuchElementException();
            }
        };
    }


}
