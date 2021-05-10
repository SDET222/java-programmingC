package repl_it.arrays_tasks;
import java.util.*;
public class LongestWordArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        String longest ="";

        for (int i = 0; i < words.length; i++) {

            if (words[i].length()>longest.length()) {
                longest=words[i];
            }

        }
        System.out.println(longest);








    }
}
