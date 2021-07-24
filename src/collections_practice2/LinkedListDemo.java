package collections_practice2;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        l.add("X");
        l.add("Y");
        l.add("Z");
        l.add("A");
        l.add("B");
        l.add("C");

        LinkedList l2 = new LinkedList();
        l2.addAll(l);

        System.out.println(l2);
        l2.add("R");
        l2.removeAll(l);

        System.out.println(l2);

        Collections.sort(l);

        System.out.println(l);

        //Collections.reverse(l);
        System.out.println(l);

        Collections.sort(l,Collections.reverseOrder());
        System.out.println("Reverse order  "+l);

        Collections.shuffle(l);
        System.out.println("Shuffled = " +l);













    }
}
