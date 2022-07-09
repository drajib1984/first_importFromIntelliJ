package CollectionsAPI;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue();
        PriorityQueue pp = new PriorityQueue();

//adding eelements
        pq.add("anb");
        pq.add("anb");
        pq.add("RAJIB");
        pq.offer("ANA");

        System.out.println(pq);

        System.out.println(pq.element());
        System.out.println(pq.peek());


        System.out.println(pp.peek());
       // System.out.println(pp.element());

        System.out.println(pq.remove("ANA"));
        System.out.println(pq.remove());
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);

        LinkedList lq = new LinkedList();
        lq.add("A");
        lq.add("A");
        lq.add("B");
        lq.add("C");
        lq.add("D");
        lq.offer(100);
        System.out.println(lq);

        System.out.println(lq.element());
        System.out.println(lq.peek());

        System.out.println(lq.remove());
        System.out.println(lq);

        System.out.println(lq.poll());
        System.out.println(lq);

    }
}
