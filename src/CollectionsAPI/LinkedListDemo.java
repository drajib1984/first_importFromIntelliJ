package CollectionsAPI;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); // for heterogeneous data
        LinkedList<String> l = new LinkedList<String>(); // for homogeneous data
        ll.add(100);
        ll.add("Welcome");
        ll.add(15.5);
        ll.add('A');
        ll.add(true);
        ll.add(null);
        System.out.println(ll);
        System.out.println(ll.size());
        ll.add(0,"India");

        ll.addFirst("Tripura");

        System.out.println(ll);

        ll.remove(4);

        System.out.println(ll);

        ll.removeFirst();
        System.out.println(ll);
        System.out.println(ll.get(3));

        System.out.println(ll.getFirst());

        System.out.println(ll.getLast());

        ll.set(2,"Rajib");

        System.out.println(ll);

        System.out.println(ll.contains('A'));

        System.out.println(ll.isEmpty());
// All data inside the LinkedList
        for(int i = 0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }
        LinkedList al = new LinkedList();
        al.add('A');
        al.add('B');
        al.add('C');
        al.add('D');
        al.add('X');
        al.add('Y');
        al.add('Z');

        LinkedList dup_list = new LinkedList();
        dup_list.addAll(al);
        System.out.println(dup_list);
        Collections.sort(dup_list,Collections.reverseOrder());
        System.out.println(dup_list);
        Collections.sort(dup_list);
        System.out.println(dup_list);
        Collections.shuffle(dup_list);
        System.out.println(dup_list);
        al.removeAll(dup_list);
        System.out.println(al);
        System.out.println(dup_list);

    }
}
