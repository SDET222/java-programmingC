package saim_tasks;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {

        int num = 15;
        int [] arr = new int[num+1];
        arr [1] = 1;
        for (int i = 0; i <=arr.length-3; i++) {

            arr[i+2] = arr[i]+arr[i+1];
        }
        System.out.println(arr[arr.length-1]);

    }
}
