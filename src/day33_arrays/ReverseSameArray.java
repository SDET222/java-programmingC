package day33_arrays;

import java.util.Arrays;

public class ReverseSameArray {
    public static void main(String[] args) {

        int[] nums = {5, 10, 4, 100};

        for (int i = nums.length - 1; i >= 0; i--) {

            System.out.println(nums[i]);

        }

        System.out.println("**************************************");

        int num1 = 10;
        int num2 = 30;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("*********************************************");

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println();
        System.out.println("************************************");

        int[] numbers = {5, 10, 4, 100};
        System.out.println("before swap: " + Arrays.toString(numbers));

        int t = numbers[0];
        numbers[0] = numbers[3];
        numbers[3] = t;

        System.out.println("after 1st and last swap: " + Arrays.toString(numbers));
        System.out.println();

        System.out.println("***************************************");

        int [] nums2 = {11, 22 , 99, 55};

        System.out.println("before: "+Arrays.toString(nums2));

        for (int i=0; i<nums2.length/2; i++) {

            int temp2=nums2[i];
            nums2[i]=nums2[nums2.length-1-i];
            nums2[nums2.length-1-i]=temp2;
        }
        System.out.println("after: "+Arrays.toString(nums2));






    }
}
