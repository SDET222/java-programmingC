package repl_it.array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class ApendPossum {
    public static void main(String[] args) {

        ArrayList<Integer> n = new ArrayList<>(Arrays.asList(2,-5,1,-7,4));

        System.out.println(apendPossum(n));


    }
    public static ArrayList<Integer> apendPossum (ArrayList<Integer> nums) {
        /**
         * (4,-6,3,-8,0,4,3), the ArrayList that gets returned should be (4,3,4,3,14),
         * with 14 being the sum of (4,3,4,3). The original ArrayList should remain unchanged.
         */

        ArrayList<Integer> x = new ArrayList<>();

        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {

            if(nums.get(i) >= 0) {
                sum+=nums.get(i);
                x.add(nums.get(i));
            }


        } x.add(sum);


        return x;
    }
}
