package office_hours.may3;
import java.util.*;
public class TargetWord {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "Ferrari",
                "bofa","Ferrari"));

        String targetWord = "Ferrari";

        int count =0;

        for (String word:words) { // for loop get(i)

            if (word.equals(targetWord)){
                count++;
            }

        }
        System.out.println(targetWord + " was found " + count + " times");







    }
}
