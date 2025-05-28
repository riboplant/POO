package Guias.Guia2;

public class ej3 {
//    system.in.read devuelve un entero entonces declaro ch como entero
//    y luego lo casteo a char para imprimitlo
    public static void main(String[] args) throws java.io.IOException{
        int ch;
        System.out.print("Enter some text: ");
        while ((ch = System.in.read()) != '\n')
            System.out.print((char) ch + "-");
    }
}
