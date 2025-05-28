package Ejs;

public class RangeIteratorTester {
    public static void main(String[] args) {
        RangeIterator it = new RangeIterator(1, 5);
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        Range range = new Range(1, 5);
        for (Integer i : range) {
            System.out.print(i + " ");
        }
        System.out.println();
        Queue<Integer> queue = new QueueImpl<>();
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(9);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        for(Integer elem : queue) {
            System.out.print(elem + " ");
        }

    }
}


