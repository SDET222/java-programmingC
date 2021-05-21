package repl_it.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatAll {
    public static void main(String[] args) {

        ArrayList<Boolean> n = new ArrayList<>(Arrays.asList(true,false,true));

        System.out.println(repeatAll(n));


    }
    public static ArrayList<Boolean> repeatAll (ArrayList<Boolean> list) {

        ArrayList<Boolean> b = new ArrayList<>();

        for (boolean each:list) {

            b.add(each);
        }
        for (boolean each:list) {

            b.add(each);
        }


        return b;
    }
}
