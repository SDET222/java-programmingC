package Interview;

import java.util.ArrayList;
import java.util.*;


public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {

    int[] nums = {2,3,4,4,3,2,8,3,55,44};
        System.out.println(uniqueFromArray(nums));
        System.out.println(removeDups(nums));
        System.out.println("uniqieFromArray2(nums) = " + uniqieFromArray2(nums));
    }
    public static List<Integer> uniqueFromArray(int[]nums){

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                numbers.add(nums[i]);
            }
        }



        return numbers;
    }

    public static List<Integer> removeDups(int[] nums2) {
        List<Integer> nonDup = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if(!nonDup.contains(nums2[i])){
                nonDup.add(nums2[i]);
            }
        }
        return nonDup;
    }

    public static List<Integer> uniqieFromArray2(int[] nums3) {
        List<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i <nums3.length ; i++) {
            uniqueList.add(nums3[i]);
        }
        uniqueList.removeIf(each->Collections.frequency(uniqueList,each)>1);
        return uniqueList;
    }

}
