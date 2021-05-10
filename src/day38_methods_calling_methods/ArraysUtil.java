package day38_methods_calling_methods;

import java.util.Arrays;
import java.util.Random;

public class ArraysUtil {


    public static void printArrays(int[] nums) {

        System.out.println(Arrays.toString(nums));
    }

    public static int sum(int[] nums) {
        int sum = 0;
        for (int each : nums) {
            sum += each;
        }
        return sum;
    }

    public static boolean isContains(int[] nums, int num) {
    boolean isContains = false;
        for(int each:nums) {
            if(each==num) {
                return true;
            }

            }
        return isContains;
        }

    public static int [] getRandomIntArray(int size, int maxRandomNumber) {

        Random random = new Random();
        int[] arr = new int[size];

        for(int i=0; i<size; i++ ) {
            arr[i]= random.nextInt(maxRandomNumber+1);
        }
        return arr;
    }



    }



