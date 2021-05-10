package repl_it.arrays_tasks;
import java.util.*;
public class PrintFirstAndLast {
    public static void main(String[] args) {

        /**Given a String array words, iterate through each word and print
         * first and last letter of each element in separate lines.*/
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for (int i = 0; i <words.length; i++) {

            System.out.println(words[i].charAt(0)+""+words[i].charAt(words[i].length()-1));
        }






    }
}
