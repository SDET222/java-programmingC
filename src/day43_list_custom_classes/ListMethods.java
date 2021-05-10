package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());

        System.out.println("size = "+ getDays().size());
        System.out.println(" get 0 = " + getDays().get(0));

        List<String> dayNames = getDays();

        System.out.println("day names = " + dayNames);
        dayNames.add("java day");
        System.out.println(dayNames);

        dayNames.removeIf( day-> day.length()==6 ); // works as for each loop

        System.out.println(dayNames);
        System.out.println("==============================");

        System.out.println(getRandomList(15));

    }

    public static List<String> getDays () {
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday",
                "Wednesday","Thursday","Friday","Saturday","Sunday"));
        return days;
    }

    public static List<Integer> getRandomList (int size) {
        List<Integer> rList = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <=size; i++) {
            rList.add(random.nextInt(100)+1);
        }
return rList;
    }


}
