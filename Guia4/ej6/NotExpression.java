package Guias.Guia4.ej6;

public class NotExpression extends Expression{
    private final Expression e;
    public NotExpression(Expression e){
        this.e = e;
    }
    public boolean evaluate(){
        return !e.evaluate();
    }
}
