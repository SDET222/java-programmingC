package day63_collections_map;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {

        Queue<String> q = new ArrayDeque<>();
        q.add("one");
        q.add("two");
        q.add("three");
        q.add("four");
        q.add("five");
        System.out.println(q.element()); // will throw noSuchElementException
        System.out.println(q.peek());  // null

        System.out.println(q.remove()); // will throw noSuchElementException

        System.out.println("q.poll() = " + q.poll()); // null


        System.out.println(q);











    }
}
