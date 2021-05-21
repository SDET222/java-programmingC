package repl_it.array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("hi","hey","java","hey"));

        System.out.println(removeAll(list1,"hey"));



    }
    public static ArrayList<String> removeAll (ArrayList<String> list, String target) {

       list.removeIf(each->each.equals(target));


        return list;
    }
}
