package repl_it.StringManipulations;
import java.util.Scanner;
public class Middle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        /**Given a String variable word print the middle three characters if the word is
         *         an odd number of characters and has more than 5 characters.
         *                 If the word does not meet the requirements print invalid.
         */

        String word = scan.next();   // apple

        if(word.length() % 2 != 0 && word.length() >=5 ) {
            System.out.println(""+word.charAt(word.length() / 2 - 1) +
                    word.charAt(word.length() / 2) + word.charAt(word.length() / 2 + 1) );
        } else {
            System.out.println("invalid");
        }







    }
}
