package saim_tasks.ArrayList_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseAll {
    public static void main(String[] args) {

        List<String> test = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));

        System.out.println(reverseAll(test));
    }
    public static List<String> reverseAll (List<String> words) {

        /**Input: {"ted", "talk", "learn"}
         Output: {"det", "klat", "nrael" }*/
        List<String> reversed = new ArrayList<>();

        words.toArray();
        String s = "";
        for (int i =0; i< words.size(); i++) {
            s = "";
        for (int j =words.get(i).length()-1; j>=0; j--) {
           s+= words.get(i).charAt(j);

        }reversed.add(s);

        }
        return reversed;
        }

    }

