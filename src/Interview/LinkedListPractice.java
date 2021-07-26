package Interview;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.add(4);
        l.add("a");
        l.add(true);
        l.add(null);

        System.out.println(l);

        l.set(0,222);

        System.out.println(l);

        for (Object o : l) {
            System.out.println(o);
        }
        System.out.println("===============================");

        Iterator it = l.iterator();

        while(it.hasNext()) {

            System.out.println(it.next());
        }
        System.out.println("===============================");

        LinkedList list = new LinkedList();

        list.add("X");
        list.add("Y");
        list.add("Z");
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("===============================");

        LinkedList list2 = new LinkedList();

        list2.addAll(list);

        System.out.println("list2 = " + list2);
        list2.removeAll(list);
        System.out.println("list2 = " + list2);

        System.out.println("list before sorting = " + list);
        Collections.sort(list);
        System.out.println("list after sorting= " + list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("after reverse order "+list);

        Collections.shuffle(list);
        System.out.println("after shuffling "+ list);

    }
}
