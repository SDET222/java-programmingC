package day40_arrayList;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {


      ArrayList<Integer> nums = new ArrayList<>();
      nums.add(255);
      nums.add(10);
      nums.add(7);
        System.out.println("size = "+nums.size());
        System.out.println(nums);

        System.out.println("index 0 = "+nums.get(0));
        System.out.println("index 1 = "+nums.get(1));
        System.out.println("index 2 = "+nums.get(2));

        nums.remove(0);
        System.out.println(nums);



    }
}
