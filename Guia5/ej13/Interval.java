package Guias.Guia5.ej13;

import java.util.Iterator;
import java.util.Objects;

public class Interval implements Iterable<Double>{
    private final double start;
    private final double end;
    private final double increment;

    public Interval(double start, double end, double increment) throws IllegalArgumentException {
        if(increment <= 0){
            throw new IllegalArgumentException("Incremento invalido al intentar crear instancia de Interval");
        }
        this.start = start;
        this.end = end;
        this.increment = (end >= start) ? increment : -increment;
    }

    public Interval(double start, double end) {
        this.start = start;
        this.end = end;
        this.increment = (end >= start) ? 1 : -1;
    }

    public long size() {
        return (long)((end - start)/increment);
    }

    public double at(long index) throws IllegalArgumentException {
        if(index <= 0){
            throw new IllegalArgumentException("Index invalido en metodo at");
        }
        return start + ((index - 1) * increment);
    }

    public long indexOf(double value){
        for(long i=0; start + i*increment <= end; i++){
            if(start + i*increment == value){
                return i + 1;
            }
        }
        return 0;
    }

    public boolean includes(double value){
        return indexOf(value) > 0;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                ", increment=" + increment +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object instanceof Interval o){
            return start == o.start && end == o.end && increment == o.increment;
        //como son double primitivo los comparo con ==, si no seria con Double.compare
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end, increment);
    }


    @Override
    public Iterator<Double> iterator() {
        return new Iterator<Double>() {
            double current = start;
            @Override
            public boolean hasNext() {
                return current <= end;
            }

            @Override
            public Double next() {
                double ans = current;
                current += increment;
                return ans;
            }
        };
    }
}