package repl_it.arrays_tasks;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        int [] a = {10, 40, 50, 3, 1};
        int [] b = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(addElements(a,b)));






    }
    public static int [] addElements (int [] arr1, int[] arr2) {

        int [] sum = new int[arr1.length];

        for (int i = 0; i < arr1.length || i<arr2.length; i++) {

            sum[i] = arr1[i]+arr2[i];

        }
        return sum;


    }
}
