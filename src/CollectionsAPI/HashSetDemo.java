package CollectionsAPI;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet(); //default load factor 0.75
        HashSet hh = new HashSet(100, (float) 0.95); //load factor as 0.95
        hh.add("Rajib");
        hh.add(100);
        hh.add("India");
        hh.add(154.2646);
        hh.add('A');
        hh.add(true);
        hh.add(null);
        System.out.println(hh); // insertion order not preserved
        hh.remove(true);
        System.out.println(hh);

        System.out.println(hh.contains("India"));
        System.out.println(hh.contains('a'));
        System.out.println(hh.isEmpty());
        System.out.println(hs.isEmpty());

        HashSet<Integer> hi = new HashSet<Integer>();

        hi.add(2);
        hi.add(4);
        hi.add(6);
        System.out.println(hi);

        HashSet<Integer> ab = new HashSet<Integer>();

        ab.addAll(hi);
        System.out.println(ab);
        ab.add(10);
        System.out.println(ab);
        ab.removeAll(hi);
        System.out.println(ab);
        System.out.println(hi);

// Union, intersection & difference

        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println(set1);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(5);
        set2.add(6);
        set2.add(7);


        System.out.println(set2);
//union
        set1.addAll(set2);
        System.out.println(set1);
//intersection
        set1.retainAll(set2);
        System.out.println(set1);
//difference

        set1.removeAll(set2);
        System.out.println(set1);
//subset
        System.out.println(set1.containsAll(set2));

    }


    }

