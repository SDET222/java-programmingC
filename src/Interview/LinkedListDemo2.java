package Interview;

import java.util.*;

public class LinkedListDemo2 {
    public static void main(String[] args) {

        LinkedList  l = new LinkedList();
        l.add("dog");
        l.add("cat");
        l.add("dog");
        l.add("horse");
        System.out.println("l = " + l);

        l.addFirst("Fox");
        System.out.println(l);
        l.addLast("Bear");
        System.out.println(l);
        l.add(0,"Lion");
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());

        l.removeFirst();
        l.removeLast();
        System.out.println("l = " + l);


    }
}
