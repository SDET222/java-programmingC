package repl_it.loop4;
import java.util.Scanner;
public class CountTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /**We'll say that a "triple" in a string is a char appearing three times in a row.
         * Print out the number of triples in the given string. The triples may overlap. */

        String word = scan.next();
        int count = 0;

        for (int i = 0; i <word.length()-2;i++) {

            if (word.charAt(i)==word.charAt(i+1) && word.charAt(i)==word.charAt(i+2)){
                count++;
            }

        }
        System.out.println(count);













    }
}
