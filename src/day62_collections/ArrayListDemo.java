package day62_collections;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        List<String> cities = new ArrayList<>();
        Collection<String> schools = new ArrayList<>();

        cities.add("San-Diego");
        cities.add("Crystal City");
        cities.add("Crystal City");
        schools.add("Stanford");

        System.out.println(cities);
        System.out.println(cities.get(0));
        System.out.println(cities.size());







    }
}
