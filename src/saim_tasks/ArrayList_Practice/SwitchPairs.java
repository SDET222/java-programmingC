package saim_tasks.ArrayList_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwitchPairs {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat", "java","good"));

        System.out.println(switchIt(words));

    }

    public static List<String> switchIt(List<String> list) {

        /**Ex:
         Input: {"Cat", "in", "the", "hat"}
         There is two pairs: "Cat" and "in"
         "the" and "hat"
         Output: {"in", "Cat", "hat", "the */


        String temporary = "";

        for (int i = 0; i < list.size(); i++) {

            temporary = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temporary);

            i++;

        }

        return list;
    }
}
