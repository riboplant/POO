package Ejs;

import java.util.function.Function;

public class FunctionTester {
    public static void applyToArray(Double[] v, Function<Double, Double> f ){
        for(Double x : v){
            System.out.println(f.apply(x));
        }
    }

    public static void main(String[] args) {

        Double[] t = {0.0, 0.1, 0.2, 0.5, 0.6, 0.7};
        Function f = new Function<Double, Double>() {
            @Override
            public Double apply(Double x) {
                return Math.sin(x);
            }
        };
        System.out.println("Forma 2:");
        for(Double d : t){
            System.out.println(f.apply(d));
        }

        System.out.println("\nForma 3:");
        applyToArray(t, (x -> Math.sin(x)));
        System.out.println("OK");
    }


}
