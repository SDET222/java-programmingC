package day40_arrayList;

import java.util.ArrayList;
import java.util.List;

public class RawArrayList {
    public static void main(String[] args) {

        //raw type

        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList();

        list1.add("java");
        list1.add("coffee");
        list1.add(1234);
        list1.add(55.1);
        list1.add('A');
        list1.add(true);
        list1.add("BAKU");

        System.out.println("list1 = " + list1);
        System.out.println("size = "+list1.size());

        // restricted type
        ArrayList<Integer> nums = new ArrayList<>();






    }
}
