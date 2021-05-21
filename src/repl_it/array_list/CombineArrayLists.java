package repl_it.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CombineArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5,2,4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,3,7));

        System.out.println(combineAll(list1,list2));


    }
    public static ArrayList<Integer> combineAll (ArrayList<Integer> list1, ArrayList<Integer> list2) {


        Collections.sort(list1);
        Collections.sort(list2);
        ArrayList<Integer> combined = new ArrayList<>();
        //int j = 0;
        for(int each:list1) {
            combined.add(each);

        }
        for (int i = 0; i < list2.size(); i++) {
            combined.add(list2.get(i));
        }

        return combined;
    }
}
