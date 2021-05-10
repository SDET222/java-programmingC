package day41_array_list;

import java.util.*;


public class CitiesList {
    public static void main(String[] args) {

        ArrayList<String> cities  = new ArrayList<>();
        cities.add("Baku");
        cities.add("NewYork");
        cities.add("Washington D.C");
        cities.add("Miami");
        cities.add(0,"Istanbul");

        System.out.println(cities);

        System.out.println(cities.get(0));
        System.out.println(cities.get(cities.size()-1));

        System.out.println("==================");

        for(String city:cities) {
            System.out.println(city+ " ");
        }

       // cities.remove("NewYork");

        System.out.println(cities);

        cities.remove(1);

        System.out.println(cities);

        cities.clear();
        System.out.println(cities);
        System.out.println(cities.size());

        if (cities.isEmpty()) {
            System.out.println("list is empty");
        }



    }
}
