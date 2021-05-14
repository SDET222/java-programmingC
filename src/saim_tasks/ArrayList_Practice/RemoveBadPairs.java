package saim_tasks.ArrayList_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveBadPairs {
    public static void main(String[] args) {

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7));

        System.out.println(removeBadNumbers(list2));

    }
    public static ArrayList<Integer> removeBadNumbers (ArrayList<Integer> nums) {

//        Ex:
//        Input: {3, 4, 6, 1, 1, 10, 8, 7};
//        Output: {3, 4, 1, 10};
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums.size()-1; i++) {

            if(nums.get(i) < nums.get(i+1)) {
                list2.add(nums.get(i));
                list2.add(nums.get(i+1));
                nums.remove(nums.get(i));
                nums.remove(nums.get(i+1));
            }

        }


        return list2;

    }

}
