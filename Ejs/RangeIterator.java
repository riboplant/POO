package Ejs;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class RangeIterator implements Iterator<Integer> {
    private Integer start, end, i;


    @Override
    public boolean hasNext() {
        return i <= end;
    }

    @Override
    public Integer next() {
        if(hasNext())
            return i++;
        else
            throw new NoSuchElementException();
    }

    public RangeIterator(Integer start, Integer end) {
        this.start = start;
        this.end = end;
        this.i = start;
    }
}
