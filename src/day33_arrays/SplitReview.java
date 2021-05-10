package day33_arrays;
import java.util.*;
public class SplitReview {
    public static void main(String[] args) {

        String word = "java";

        String[] arr = word.split("a");

        System.out.println(Arrays.toString(arr));
        int countOfA=arr.length - 1;
        System.out.println("count of a = "+countOfA); // if ends with a, add more

        if(word.endsWith("a")){
            countOfA++;

        }
        System.out.println("count of a = "+countOfA);
        System.out.println();

        System.out.println("****************Split with empty String**********************");

        String word2 = "java";

        String[] array = word.split("");

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);









    }
}
