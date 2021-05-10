package repl_it.first_practice;
import java.util.Scanner;
public class ContainsWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word and sentence:");
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        System.out.println(sentence.contains(word));








    }
}
