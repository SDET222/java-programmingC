package saim_tasks.ArrayList_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicatesArrList {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(51,25,11,5,11,25));
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(5,2,1,2,1,2,7,9));

        System.out.println(removeDupArrList(nums));

        System.out.println(findUnique(nums2)); //5,7,9

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

    public static List<Integer> findUnique(List <Integer> nums) {


        nums.removeIf(each->Collections.frequency(nums,each)>1); // or nested loop

        return nums;
    }
}
