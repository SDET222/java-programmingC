package repl_it.array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class TimesTwo {
    public static void main(String[] args) {

        ArrayList<Integer> r = new ArrayList<>(Arrays.asList(2,4,5));

        System.out.println(timesTwo(r));



    }
    public static ArrayList<Integer> timesTwo (ArrayList<Integer> nums) {

        ArrayList<Integer> r = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            r.add(nums.get(i)*2);

        }

        return r;

    }
}
