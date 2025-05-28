package Guias.Guia4.ej11;

public class Polynomial {

    private Double[] p;

    public Polynomial(int n) throws InvalidGradeException{
        if(n<0)
            throw new InvalidGradeException();
        this.p = new Double[n];
    }

    public void set(int n, double x) throws InvalidIndexException{
        if(n > p.length - 1)
            throw new InvalidIndexException();
        p[n-1] = x;
    }

    public Double eval(double x){
        double ans = 0;
        int i = 0;
        for(Double a : p){
            if(a != null)
                ans += a * Math.pow(x, p.length - i);
            i++;
        }
        return ans;
    }
}
