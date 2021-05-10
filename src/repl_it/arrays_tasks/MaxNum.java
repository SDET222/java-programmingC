package repl_it.arrays_tasks;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int max = nums[0];

        for (int n : nums) {

            if (n > max) {
                max = n;

            }


        }
        System.out.println(max);


    }
}
