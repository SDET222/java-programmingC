package repl_it.arrays_tasks;

import java.util.Arrays;

public class ShiftLeft {
    public static void main(String[] args) {


        /**Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes
         *  {2, 5, 3, 6}. You may modify and print the given array, or print a new array. */


        int[] nums = {6, 2, 5, 3};


        int[] numsNew = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            if (i == nums.length - 1) {
                numsNew[i] = nums[0];
            } else {
                numsNew[i] = nums[i + 1];
            }

        }
        System.out.println(Arrays.toString(numsNew));


        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
        System.out.println(Arrays.toString(nums));


    }
}
