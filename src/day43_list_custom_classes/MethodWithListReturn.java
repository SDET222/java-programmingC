package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodWithListReturn {
    public static void main(String[] args) {
        long start = System.nanoTime();
        List<Integer> mlnNums = getIntegerList();
            long end = System.nanoTime();
            double listSeconds = (end-start) / 1_000_000_000.0;
        System.out.println("Array list in seconds = " + listSeconds);
        System.out.println("ArrayList time = " + (end - start));

       //System.out.println(mlnNums);


        long st = System.nanoTime();
      int [] arr = getIntegerArray();
      long en = System.nanoTime();

      double seconds = (en-st) / 1_000_000_000.0;
        System.out.println("Array time = " + (en - st));
        System.out.println("Array time in seconds = " + seconds);

        System.out.println("===========================================");

        //System.out.println(Arrays.toString(arr));




    }
    public static List<Integer> getIntegerList () {

        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <=1000000 ; i++) {
            nums.add(i);
        }


        return nums;
    }
    public static int[] getIntegerArray() {
        int [] arr = new int[1000_001];
        for (int i = 0; i <=1000000 ; i++){
           arr[i]=i;
        }
        return arr;
    }


}
