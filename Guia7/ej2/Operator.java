package Guias.Guia7.ej2;

@FunctionalInterface
public interface Operator <ValueIn, ValueOut>{
    ValueOut reduce(ValueOut accum, ValueIn value);
}
