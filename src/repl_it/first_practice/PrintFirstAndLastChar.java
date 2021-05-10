package repl_it.first_practice;
import java.util.Scanner;
public class PrintFirstAndLastChar {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String word = scan.next();
        char firstChar = word.charAt(0);
        char lastChar= word.charAt(word.length()-1);
        String result = ""+firstChar+lastChar;

        System.out.println(result);








    }
}
