package day63_collections_map;

import java.util.HashMap;
import java.util.*;
public class MapExp2 {
    public static void main(String[] args) {

        // id, Person

        Map<Integer,Person> map = new HashMap<>();
        map.put(12,new Person("Bob",33));
        map.put(null,new Person("",44));

        System.out.println("map.get(12) = " + map.get(12));
        System.out.println(map.get(null));
        map.put(2,new Person("Orkhan",42));
        System.out.println(map);
        System.out.println("====================================");
// order maintain
        Map<Integer,Person> map2 = new LinkedHashMap<>();
        map2.put(12,new Person("Bob",33));
        map2.put(null,new Person("",44));
        map2.put(2,new Person("Orkhan",42));

        System.out.println(map2);

        System.out.println("====================================");
// order sorted, does not except null key!
        Map<Integer,Person> map3 = new TreeMap<>();
        map3.put(12,new Person("Bob",33));
        map3.put(0,new Person("",44));
        map3.put(2,new Person("Orkhan",42));

        System.out.println(map3);


    }
}
