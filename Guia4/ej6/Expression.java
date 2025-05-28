package Guias.Guia4.ej6;


public abstract class Expression {


    public abstract boolean evaluate();

    public Expression or(Expression e){
        return new OrExpression(this,e);
    }
    public Expression and(Expression e){
        return new AndExpression(this, e);
    }
    public Expression not(){
        return new NotExpression(this);
    }

}
