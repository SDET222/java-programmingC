package repl_it.arrays_tasks;

import java.util.Arrays;

public class FrontPiece {
    public static void main(String[] args) {

        /**Given an int array num of any length, print a new array of its first 2 elements.
         *  If the array is smaller than length 2, use whatever elements are present. */


            int [] nums = {15};
            int [] only = new int[2] ;

           //for (int n:nums) {
               if (nums.length>=2){
                 only[0]=nums[0];
                 only[1]=nums[1];
                   System.out.println(Arrays.toString(only));
               } else {
                   System.out.println(Arrays.toString(nums));
               }

         //  }











    }
}
