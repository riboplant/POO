package Guias.Guia4.ej15;

public enum ExtendedOperation implements Operation{
    POTENCIA("^", Math::pow),
    MODULO("%", (x, y)->x%y);

    private String operando;
    private Operation op;

    ExtendedOperation(String operando, Operation op){
        this.operando = operando;
        this.op = op;
    }
    @Override
    public double apply(double x, double y){
        return op.apply(x, y);
    }
    @Override
    public String toString(){
        return operando;
    }
}
