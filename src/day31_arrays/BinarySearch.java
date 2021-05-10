package day31_arrays;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {


        int [] nums = {-45,-15,-5, 25 , 35,120, 38};

        System.out.println(Arrays.binarySearch(nums,25));
        System.out.println(Arrays.binarySearch(nums,-15));
        System.out.println(Arrays.binarySearch(nums,-5));

        if (Arrays.binarySearch(nums,25)>=0) {
            System.out.println("25 is here");
        } else {
            System.out.println("Not here");
        }











    }










}
