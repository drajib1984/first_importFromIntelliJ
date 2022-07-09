package CollectionsAPI;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHasSetDemo {

    public static void main(String[] args) {

        LinkedHashSet ls = new LinkedHashSet();
        LinkedHashSet<Integer> ll = new LinkedHashSet<Integer>();
        ls.add(100);
        ls.add(200);
        ls.add(300);
        ls.add(400);
        ls.add(500);
        System.out.println(ls);

    }
}
