package CollectionsAPI;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        HashMap<Integer,String> hh= new HashMap<Integer,String>();

        hm.put(101,"John");
        hm.put(102,"Scott");
        hm.put(103,"Amy");
        hm.put(104,"John");
        hm.put(105,"Smith");


        System.out.println(hm);

        System.out.println(hm.get(105));

        System.out.println(hm.remove(105));
        System.out.println(hm);
        System.out.println(hm.containsKey(105));
        System.out.println(hm.containsValue("Amy"));
        System.out.println(hm.containsValue("Raj"));
        System.out.println(hm.isEmpty());
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.size());
        System.out.println(hm.entrySet());

// Entry Methods




    }
}
