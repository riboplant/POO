package Guias.Guia7.ej1;

import java.util.ArrayList;
import java.util.List;

public class FilterListTester {
    public static void main(String[] args) {
        FilterList<Integer> list = new ArrayFilterList<>();
        for(int i = 0; i<20; i++)
            list.add(i);
        System.out.println(list);
        List<Integer> list2 = list.ej1((o) -> (o%2) == 0);
        System.out.println(list2);
    }
}
