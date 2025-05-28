package Guias.Guia5.ej7;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayTester {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{7, 3, 1, 5, 9};
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        Arrays.sort(intArray, (o1, o2) -> o1.compareTo(o2));
        System.out.println(Arrays.toString(intArray));
    }
}
