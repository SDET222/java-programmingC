package day42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        //  List<String> words = new ArrayList<>(Arrays.asList("java" , "c#", "selenium"));
        printStrList(Arrays.asList("java", "c#", "selenium"));
        System.out.println("\n===============");
        List<Integer> newIntegers = new ArrayList<>(Arrays.asList(15, 45, 25));
        System.out.println(sumIntegerList(Arrays.asList(5, 7, 9, 15, 77)));
        System.out.println("newIntegers = " + sumIntegerList(newIntegers));


    }

    public static void printStrList(List<String> list) {
        for (String each : list)
            System.out.print(each + " ");
    }

    public static int sumIntegerList(List<Integer> integers) {
        int sum = 0;
        for (int each : integers) {
            sum += each;
        }
        return sum;
    }

}
