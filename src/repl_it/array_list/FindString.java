package repl_it.array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class FindString {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("one apple","two orange","four banana"));

        System.out.println(findString(list,"four"));

    }
    public static String findString (ArrayList<String> list, String find) {

        for (String each:list) {
            if (each.contains(find)) {
                return find;
            }

        }

        return "Search Failed";
    }

}
