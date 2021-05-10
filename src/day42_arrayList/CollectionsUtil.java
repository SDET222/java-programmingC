package day42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtil {
    public static void main(String[] args) {

        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));

        System.out.println("size = " + letters.size());

        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("reversed = " + letters);


        System.out.println(Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');

        System.out.println(vCount);

        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));

        Collections.reverse(letters);

        Collections.replaceAll(letters, 'j', 'x');

        System.out.println("after replace all = " + letters);

        Collections.sort(letters);
        System.out.println("sorted = " + letters);

        List<Integer> nums = Arrays.asList(23, 45, 95, 14, 2, 99, 11, 2, 2, 2, 99, 9, 99, 99);

        System.out.println(nums);

        Collections.reverse(nums);
        System.out.println("reversed = " + nums);

        int max = Collections.max(nums);

        System.out.println("max number is --> " + max);

        int min = Collections.min(nums);

        System.out.println("min = " + min);



        System.out.println("there are " + Collections.frequency(nums,99) + "  99s");

        int countOfTwos = Collections.frequency(nums,2);

        System.out.println("countOfTwos = " + countOfTwos);

        Collections.replaceAll(nums,2,222);

        System.out.println("after replaceAll = "+ nums);

        Collections.sort(nums);
        System.out.println("Sorted = " + nums);

        Collections.sort(nums, Collections.reverseOrder());

        System.out.println("after reverse sort = " + nums);

    }
}
