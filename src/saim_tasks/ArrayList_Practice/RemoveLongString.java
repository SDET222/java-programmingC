package saim_tasks.ArrayList_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {

    public static void main(String[] args) {

        ArrayList<String> arr2 = new ArrayList<>((Arrays.asList("one","two","three")));
        System.out.println(removeL(arr2,4));


    }
    public static ArrayList<String> removeL (ArrayList<String> strArr, int length) {

        strArr.removeIf(each -> each.length()<length);


        return strArr;
    }

}
