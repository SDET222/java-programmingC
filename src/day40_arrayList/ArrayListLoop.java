package day40_arrayList;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(7);nums.add(11);nums.add(55);nums.add(17);
        nums.add(85);nums.add(177);

       // nums.remove(55);  outOfBounds

        nums.remove(new Integer (55));
        System.out.println("Removed first 55 --> "+nums);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        System.out.println("=========================================");
        for(int each:nums) {
            System.out.print(each+" ");
        }
        System.out.println();










    }
}
