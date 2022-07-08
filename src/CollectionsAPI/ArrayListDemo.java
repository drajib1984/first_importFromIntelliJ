package CollectionsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        ArrayList<String> str = new ArrayList<String>();
        ArrayList<Integer> num = new ArrayList<Integer>();
        List ll = new ArrayList<>();

        //add new objects
        al.add(100);
        al.add("Rajib");
        al.add(15.5);
        al.add('A');
        al.add("Disny");
        al.add(100000);

        System.out.println(al);
        int size = al.size();
        System.out.println(size);
        al.remove(15.5);
        al.remove(2);
        System.out.println(al);
        al.add(2,300);
        System.out.println(al);

        System.out.println(al.get(3));
        al.set(4,"New Entry");
        System.out.println(al);

        //search elements

        System.out.println(al.contains("Rajib"));
        System.out.println(al.contains(10000));
       //empty or not
        System.out.println(al.isEmpty());

        // Elemeents inside the arraylist

        for(int i = 0;i<al.size();i++){
            System.out.println(al.get(i));
        }
// Add all elements from on array list to another
        str.add("A");
        str.add("B");
        str.add("C");
        str.add("X");
        str.add("Y");
        str.add("Z");
        System.out.println(str);
        ArrayList dup_list = new ArrayList<>();
        dup_list.addAll(str);
        System.out.println(dup_list);

// Remove all elements from on array list
        str.removeAll(str);
        System.out.println(str);
//Sort & reverse sorting & shuffle
        Collections.sort(dup_list,Collections.reverseOrder());
        System.out.println(dup_list);
        Collections.sort(dup_list);
        System.out.println(dup_list);
        Collections.shuffle(dup_list);
        System.out.println(dup_list);

       String [] arr = {"Dog","Horse","Elephant"};
       for(String value:arr){
           System.out.println(value);
       }

       ArrayList az = new ArrayList(Arrays.asList(arr));
        System.out.println(az);

    }
}
