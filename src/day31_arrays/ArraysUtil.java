package day31_arrays;
import java.util.*;
public class ArraysUtil {
    public static void main(String[] args) {

        int [] nums = {5, 3, 9, 11, 2, 0};

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0]);
        System.out.println(nums[nums.length-1]);

        System.out.println("=================================");

        String [] words = {"Just ", "Do ", "it ", "keep ", "coding "};

        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        System.out.println("["+String.join(", ", words)+"]");

        Arrays.sort(words, Collections.reverseOrder());

        System.out.println(Arrays.toString(words));


    }










}
