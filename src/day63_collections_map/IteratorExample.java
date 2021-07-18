package day63_collections_map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Selenium");
        list.add("Cucumber");
        list.add("JUnit");
        list.add("Jenkins");
        System.out.println(list);
        Iterator<String> it = list.iterator();

        it.next();
        it.remove();

        System.out.println(list);
        System.out.println("<><><><><><><><><><><><>");

        Set<String> names = new HashSet<>();
        names.add("john");
        names.add("ali");
        names.add("aziz");
        names.add("orkhan");
        names.add("J");

        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()) {
            String currentName = iterator.next();
            System.out.println(currentName);

            if(currentName.length()<3){
                iterator.remove();
            }
        }
        System.out.println(names);










    }
}
