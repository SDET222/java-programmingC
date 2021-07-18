package Interview;

import java.util.Collection;

public class Array_Find_Maximum {
    public static void main(String[] args) {
        int[] nums = {23,55,1,98,3};
        System.out.println(findMax(nums));
        System.out.println(findMin(nums));


    }



    public static int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i]) {
                max=nums[i];
            }
        }


        return max;
    }

    public static int findMin(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int each:nums){
            if(min>each){
                min=each;
            }
        }
        return min;
    }


}
