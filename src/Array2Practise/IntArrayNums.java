package Array2Practise;

import java.util.Arrays;

public class IntArrayNums {
    public static void main(String[] args) {


        int[] nums = new int[100];
        System.out.println("Even nums:");

        for(int i = 0; i<nums.length; i++) {
           nums[i]+=i+1;

        }
        for (int each:nums) {
            if(each%2!=0) {
                continue;
            }
            System.out.print(each+" ");
        }
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^");
       System.out.println("\nNums 1-100 --> "+Arrays.toString(nums));






    }
}
