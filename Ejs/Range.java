package Ejs;

import java.util.Iterator;

public class Range implements Iterable<Integer>{
    private Integer start, end, current;

    public Range(Integer start, Integer end) {
        this.start = start;
        this.end = end;
        this.current = start;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator(start, end);
    }
}
