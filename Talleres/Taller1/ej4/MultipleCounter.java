package Talleres.Taller1.ej4;

public class MultipleCounter extends Counter{
    private int times;

    public MultipleCounter(int times){
        this.times = times;
    }

    public void increment(){
        int aux = times;
        while(aux-- > 0){
            super.increment();
        }
    }

    public void decrement(){
        int aux = times;
        while(aux-- > 0){
            super.decrement();
        }
    }
}
