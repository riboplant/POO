package Guias.Guia3.ej6;
import java.lang.Number;
import java.util.Objects;

public class ComplexNumber {
    private final double real;
    private final double img;

    public ComplexNumber(double real, double img){
        this.real = real;
        this.img = img;
    }

    public ComplexNumber(Number real){
        this(real.doubleValue(), 0);
    }

    @Override
    public boolean equals(Object object){
        if(this == object)
            return true;
        if (object instanceof ComplexNumber number){
            return (Double.compare(this.real, number.real) == 0) && (Double.compare(this.img, number.img) == 0);
        }
        return false;
    }
    public ComplexNumber plus(ComplexNumber number){
        return new ComplexNumber(this.real + number.real, this.img + number.img);
    }
    public ComplexNumber plus(Number real){
        return new ComplexNumber(this.real + real.doubleValue(), this. img);
    }

    @Override
    public String toString() {
        return "%.2f %c %.2f".formatted(real, img > 0 ? '+' : '-', Math.abs(img));
    }
    @Override
    public int hashCode(){
        return Objects.hash(real, img);
    }

}
