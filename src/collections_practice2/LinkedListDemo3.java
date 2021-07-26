package collections_practice2;

import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        l.add("a");
        l.add("c");
        l.add("d");
        l.add("a");

        System.out.println(l);

        l.addFirst("dog");
        System.out.println(l);
        l.addLast("cat");
        System.out.println(l);

        System.out.println("l.getFirst() = " + l.getFirst());
        System.out.println("l.getLast() = " + l.getLast());

        System.out.println("l.size() = " + l.size());

        l.removeFirst();
        System.out.println("After remove first "+l);

        l.removeLast();
        System.out.println("After remove last "+l);



    }
}
