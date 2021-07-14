package day62_collections;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>(); //polymorphism
        names.add("Murodil");
        names.add("John");
        names.add("Jim");
        names.add("Jim"); // duplicates allowed

        System.out.println("names.get(0) = " + names.get(0));
        System.out.println("names.size() = " + names.size());
        System.out.println(names);


    }
}
