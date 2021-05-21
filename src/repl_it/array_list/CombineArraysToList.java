package repl_it.array_list;

import java.util.ArrayList;

public class CombineArraysToList {

    public static void main(String[] args) {

        String[] arr1 = {"a","b","c"};
        String[] arr2 = {"x","z","y"};

        System.out.println(combineRs(arr1,arr2));

    }
    public static ArrayList<String> combineRs (String[] arr1, String[] arr2) {

        ArrayList<String> c = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            c.add(arr1[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            c.add(arr2[i]);
        }

        return c;
    }
}
