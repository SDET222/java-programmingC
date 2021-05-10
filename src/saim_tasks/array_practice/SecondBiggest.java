package saim_tasks.array_practice;
import java.util.*;
public class SecondBiggest {
    public static void main(String[] args) {

        int [] nums = {4,3,1,4,5,2,4,8,4,8};

        Arrays.sort(nums); // [1, 2, 3, 4, 4, 4, 4, 5, 8, 8]
        System.out.println(Arrays.toString(nums));

        int max = nums[nums.length-1];
        int second =nums[0];
        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i]>second && nums[i]<max) {
                second=nums[i];
            }
        }
        System.out.println(second);




    }
}
