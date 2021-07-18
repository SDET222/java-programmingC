package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosInArray {
    public static void main(String[] args) {
        int[] nums = {0,23,0,0,44,12,0,2,0,40,550,450,54};

        System.out.println(Arrays.toString(moveZeros(nums)));
    }
    public static int[] moveZeros(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int countZero = 0;

        for (Integer each : arr) {
            list.add(each);
            countZero += (each==0)? 1 :0;
        }

        list.removeAll(Arrays.asList(0));

         arr = new int[arr.length];//00000000
        for (int i = 0; i < arr.length - countZero; i++) {
            arr[i] = list.get(i);

        }
        return arr;

    }
}
