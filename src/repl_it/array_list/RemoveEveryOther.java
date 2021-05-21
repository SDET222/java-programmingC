package repl_it.array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEveryOther {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("hi","yo","sup","yolo","book"));
        System.out.println(removeEveryOther(words));

    }
    public static ArrayList<String> removeEveryOther (ArrayList<String> words) {

        for (int i = 0; i < words.size(); i=i+1) {
            words.remove(words.get(i));
        }

        return words;
    }
}
