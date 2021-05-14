package saim_tasks.ArrayList_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicatesArrList {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(51,25,11,25,1,25,7,91));

        System.out.println(removeDupArrList(nums));

    }
    public static List<Integer> removeDupArrList (List <Integer> nums) {

        List<Integer> unique = new ArrayList<>();

        for(int each:nums){
            if(!unique.contains(each)) {
                unique.add(each);
            }

        }
            return unique;

    }


}
