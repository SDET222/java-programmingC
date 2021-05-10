package repl_it.methods;
import java.util.*;
public class ConcatArrays {
    public static void main(String[] args) {
        int[] arr1 = {25, 24, 23};
        int[] arr2 = {11, 22, 33};

        System.out.println(Arrays.toString(concatArr(arr1,arr2)));

    }
    public static int[] concatArr (int[] arr1, int[] arr2) {
        int [] result = new int [arr1.length + arr2.length];
        int i=0;
        for(int each:arr1) {
            result[i]=each;
            i++;
        }
        for(int each:arr2) {
            result[i]=each;
            i++;
        }
        return result;
    }
}
