package day29_nested_loops_arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {


        int[] nums = new int[3]; // store 3 values

        nums[0] = 5;
        nums[1] = 7;
        nums[2] = 10;
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(Arrays.toString(nums));

        int i = 0;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[i]);

        // find out size of array

        System.out.println("number of elements = " + nums.length);
        int len = nums.length;
        System.out.println("Length is " + len);

        nums[0]=90;
        nums[1]=100;
        nums[2]=200;
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);







    }
}
