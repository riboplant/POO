package Guias.Guia5.ej1;

import java.rmi.server.RemoteObjectInvocationHandler;

public class Pair <A,B> {
    private A a;
    private B b;
    public Pair(A a, B b){
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object ob){
        if( this == ob)
            return true;
        if( ob instanceof Pair<?,?> o){
            return a.equals(o.a) && b.equals(o.b);
        }
        return false;
    }

    @Override
    public String toString(){
        return "[" + a.toString() + ", " + b.toString() + "]";
    }

    public void setA(A a) {
        this.a = a;
    }

    public void setB(B b) {
        this.b = b;
    }
}
