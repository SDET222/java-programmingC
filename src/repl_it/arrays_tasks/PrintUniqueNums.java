package repl_it.arrays_tasks;

import java.util.Arrays;

public class PrintUniqueNums {
    public static void main(String[] args) {

        int [] nums1 = {1,5,7,1,9,9,8,9,8};

printUnique(nums1);

    }
    public static void printUnique (int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            count =0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i]==nums[j]) {
                    count++;
                }
            }if (count==1) {
                System.out.println(nums[i]);
            }
        }


    }
}
