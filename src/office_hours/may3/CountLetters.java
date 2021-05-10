package office_hours.may3;
import java.util.*;
public class CountLetters {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "Ferrari",
                "bofa"));


        char targetLetter = 'a';

        int count =0;

        for(String word:words) {

            for (int i = 0; i < word.length(); i++) {

                if(word.charAt(i) ==targetLetter) {
                    count++;
                }
            }
        } System.out.println(targetLetter + " was found "+ count + " times");





    }
}
