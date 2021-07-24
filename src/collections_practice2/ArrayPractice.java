package collections_practice2;

import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {

        Object [] obj = new Object[5];
        obj[0]=3;
        obj[1]="collections";
        obj[2]=4.5;

        System.out.println(Arrays.toString(obj));

        ArrayList<Integer> numsList = new ArrayList<>(Arrays.asList(2,32,14,5));

        Collections.sort(numsList);
        System.out.println(numsList);

        LinkedList linked = new LinkedList<>();

    linked.addFirst(3);   //raw
    linked.addFirst("abc");
    linked.addFirst(23);
    linked.addLast(93);
    linked.add(333);
    linked.add(null);
    linked.add(null);
    linked.add(true);
        System.out.println("linked.removeFirst() = " + linked.removeFirst());
        System.out.println(linked);

        Iterator it = linked.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
