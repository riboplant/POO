package Guias.Guia4.ej7;

public class IntervalTester {
    public static void main(String[] args) {
        Interval a = new Interval(10,20,0.5);
        Interval b = new Interval(10,20);
        Interval c = new Interval(0, 20, 0.5);
        Interval a2 = new Interval(10,20,0.5);
        System.out.println(a.equals(b));//false
        System.out.println(a.equals(a2));//true
        System.out.println(a == a2);//false

        System.out.println(a.size());//20
        System.out.println(b.size());//10

        System.out.println(b.indexOf(15));//6
        System.out.println(a.includes(15));//true

        System.out.println(c.toString());
        System.out.println(c.hashCode());
        System.out.println(a.at(4));//11.5

        Interval d = new Interval(-10, 10);

        System.out.println(d.count(new IntervalCondition() {
            @Override
            public boolean condition(double value) {
                return value > 0;
            }
        }));//10
        System.out.println(a.count(value -> value > 0 ));//20


        System.out.println("OK\n");
    }

}
