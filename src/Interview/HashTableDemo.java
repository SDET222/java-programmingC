package Interview;

import java.util.*;

public class HashTableDemo {
    public static void main(String[] args) {
        /**
         * data structure hashTable
         * difference with HashMap ->
         * HashTable is synchronized / thread safe
         * nulls are not accepted both as a key and value
         * default capacity 11
         */

        Hashtable<Integer,String> t = new Hashtable<Integer,String>();

        t.put(201,"Frank");
        t.put(202,"Fred");
        t.put(203,"Fox");
        t.put(207,"Fedor");
        System.out.println(t);

        System.out.println(t.entrySet());

        for(Map.Entry entry:t.entrySet()){
            System.out.println((entry.getKey() + " " + entry.getValue()));
        }
        System.out.println("=================================");
        //iterator()
       Set s = t.entrySet();

       Iterator itr = s.iterator();

       while(itr.hasNext()) {
           Map.Entry entry = (Map.Entry) itr.next();
           System.out.println((entry.getKey() + " " + entry.getValue()));
       }


    }
}
