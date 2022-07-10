package CollectionsAPI;

import java.util.HashSet;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {

        Hashtable hs = new Hashtable(); // default size is 11, load factor 0.75

        Hashtable<Integer,String> hh = new Hashtable<Integer,String>();

        hh.put(100,"John");
        hh.put(101,"David");
        hh.put(102,"Jack");
        hh.put(103,"John");
        hh.put(104,"Amy");

        System.out.println(hh);

        System.out.println(hh.get(101));

        System.out.println(hh.remove(103));

        System.out.println(hh);

        System.out.println(hh.containsKey(104));

        System.out.println(hh.containsKey(105));

        System.out.println(hh.containsValue("Amy"));

        System.out.println(hh.containsValue("Rajib"));

        System.out.println(hh.isEmpty());

        System.out.println(hh.keySet());

        System.out.println(hh.values());


    }
}
