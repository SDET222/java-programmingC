package repl_it.StringManipulations;
import java.util.Scanner;
public class HasJava {
    public static void main(String[] args) {

        /**Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
         * such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length,
         * including 0.
         */

        Scanner scan = new Scanner (System.in);
        String word = scan.next();

        if(word.indexOf("java") >=0 && word.indexOf("java")<=1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }






    }
}
