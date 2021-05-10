package saim_tasks.array_practice;

public class MaxMinNums {
    public static void main(String[] args) {

        int[] nums = {2, 1, 84, 94, 14, 4};
        int minNum = nums[0];
        int maxNum = nums[0];
        for (int n : nums) {

            if (n < minNum) {
                minNum = n;
            }
            if (n > maxNum) {
                maxNum = n;
            }

        }
        System.out.println("maxNum = " + maxNum);
        System.out.println("minNum = " + minNum);


    }
}
