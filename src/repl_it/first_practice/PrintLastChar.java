package repl_it.first_practice;
import java.util.Scanner;

public class PrintLastChar {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String word = scan.next();
        System.out.println(word.charAt(word.length()-1));







    }
}
