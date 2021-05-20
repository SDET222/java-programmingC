package repl_it.arrays_tasks;

import java.util.Arrays;

public class mergeR {

    public static void main(String[] args) {

        int [] d = {25,4,1};
        int [] r = {25,14,11};

        System.out.println(Arrays.toString(mergeArrays(d,r)));


    }

    public static int [] mergeArrays (int[] arr1, int[] arr2 ) {

        int[] merged = new int [arr1.length+arr2.length];
        int j=0;
        for (int i = 0; i < arr1.length; i++) {

            merged[j]=arr1[i];
            j++;
        }

        for (int i = 0; i < arr2.length ; i++) {

            merged[j]=arr2[i];
            j++;
        }


        return merged;
    }

}
