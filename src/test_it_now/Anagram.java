package test_it_now;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {


        String word1 = "java";
        String word2 = "avja";


        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        char arr1[] = word1.toCharArray();
        char arr2[] = word2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));





    }
}
