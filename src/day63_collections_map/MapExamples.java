package day63_collections_map;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {
        //id, name
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"James");
        map.put(2,"Anna");
        map.put(2,"Daria");
        map.put(100,"Joe");
        map.put(3,"Jack");

        System.out.println(map);
        System.out.println(map.get(100));

        System.out.println("map.remove(1) = " + map.remove(1));
        System.out.println(map);
        map.put(1,"Saim");
        System.out.println(map);

        System.out.println("map.containsKey(2) = " + map.containsKey(2));
        System.out.println("map.containsValue(\"Anna\") = " + map.containsValue("Anna"));

        //looping

        for (Integer key : map.keySet()) {
            System.out.println(key +" - "+map.get(key));

            if(map.get(key).equals("Daria")){
                System.out.println("this is our key "+key);
            }
        }




    }
}
