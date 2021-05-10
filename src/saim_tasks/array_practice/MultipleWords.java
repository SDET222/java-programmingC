package saim_tasks.array_practice;
import java.util.*;
public class MultipleWords {
    public static void main(String[] args) {

        String words = "apple, wooden spoon, red car, laptop";

        String[] arrWords = words.split(", ");

        for (String each:arrWords) {
            if (each.contains(" ")){
                System.out.println(each);
            }
        }
        System.out.println(Arrays.toString(arrWords));




    }
}
