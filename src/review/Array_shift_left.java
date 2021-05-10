package review;
import java.util.*;
import java.util.Arrays;

public class Array_shift_left {
    public static void main(String[] args) {

        /**Modify an array that is "left shifted" by one -- so {6, 2, 5, 3}
         * becomes {2, 5, 3, 6}. You may modify and print the given array,
         * or print a new array.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array size");
        int size = scan.nextInt();
        int [] nums = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("enter number");
            nums[i] = scan.nextInt();
        }

        int temp = nums[0];
        for (int i = 0; i < nums.length-1; i++) {
        nums[i]=nums[i+1];
        }
        nums[nums.length-1] = temp;
        System.out.println(Arrays.toString(nums));



    }
}
