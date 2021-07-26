package Interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.*;

public class Map_HashMap {
    public static void main(String[] args) {

        /**
      Duplicate keys not allowed, dup values allowed in MAP
         not sorted
         no insertion order
         is not synchronized / not thread safe
         1 null key, multiple null value
         */

        Map<String,Integer> m = new HashMap<>();
        m.put("num",5);
        m.put("num2",15);
        m.put("num3",25);
        m.put(null,25);

        System.out.println(m.containsKey("num2"));
        m.size();
        System.out.println("m.keySet() = " + m.keySet());
        System.out.println("m.values() = " + m.values());
        System.out.println("m.entrySet() = " + m.entrySet());
        System.out.println("==============================================");
        System.out.println();

        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(101,"Frank");
        hm.put(102,"Scott");
        hm.put(103,"Joe");
        hm.put(104,"Don");
        hm.put(105,"Orkhan");
        hm.put(103,"XX"); // replaced
        hm.put(106,"Scott"); // replaced

        System.out.println(hm);

        System.out.println("hm.get(105) = " + hm.get(105));
        System.out.println("hm.remove(103) = " + hm.remove(103));
        System.out.println(hm);
        System.out.println("hm.containsKey(103) = " + hm.containsKey(103));
        System.out.println("hm.containsValue(\"Orkhan\") = " + hm.containsValue("Orkhan"));
        System.out.println("hm.isEmpty() = " + hm.isEmpty());
        System.out.println("hm.keySet() = " + hm.keySet()); // SET
        System.out.println("hm.values() = " + hm.values()); // COLLECTION
        System.out.println("hm.entrySet() = " + hm.entrySet()); // SET
        System.out.println("==============================================");

        for (Integer key : hm.keySet()) {
            System.out.println(key);
        }

        for (String value : hm.values()) {
//            if(value.equals("Don")){
//                hm.put(109,"Added for Don");
//            }
            System.out.println(value);
        }

        System.out.println("hm = " + hm);

        for (Map.Entry entry : hm.entrySet()) {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

       Set s = hm.entrySet();

        Iterator it =s.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

//        Map.Entry entry = (Map.Entry) it.next();
//        System.out.println((entry.getKey() + "  " + entry.getValue()));

    }
}
