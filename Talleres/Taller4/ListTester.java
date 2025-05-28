package Talleres.Taller4;

public class ListTester {
    public static void main(String[] args) {
        List<Integer> array = new IntegerArrayList();
        System.out.println(array.size());//0
        System.out.println(array.isEmpty());//true
        System.out.println(array);
        array.add(25);
        array.add(12);
        array.add(7);
        System.out.println(array.size());//3
        System.out.println(array);
        System.out.println(array.isEmpty());//false
    }

}
