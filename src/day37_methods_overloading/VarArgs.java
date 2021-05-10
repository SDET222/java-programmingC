package day37_methods_overloading;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        sum(1,5,9);
        sum();

    }

    public static void sum (int ... nums){
        System.out.println(Arrays.toString(nums));
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        System.out.println("Sum = "+sum);
    }
}
