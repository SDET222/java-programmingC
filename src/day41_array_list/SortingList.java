package day41_array_list;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class SortingList {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(52,55,1,98,7,114));

        nums.add(101);
        nums.add(0,111);
        System.out.println("before sort = "+nums);

        Collections.sort(nums);
        System.out.println("after sort = " + nums);




    }
}
