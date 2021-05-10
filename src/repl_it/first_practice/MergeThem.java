package repl_it.first_practice;
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;
public class MergeThem {
    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);
        System.out.println("Enter word 1");
        String word = scan.next();
        System.out.println("Enter word 2");
        String word2 = scan.next();

        String merge = ""+ word.charAt(0) + word2.charAt(0) + word.charAt(1) + word2.charAt(1) +
                word.charAt(2) + word2.charAt(2) ;

        if (word.length()==3 && word2.length()==3) {
            System.out.println(merge);

        } else {
            System.out.println("Can not merge");
        }








    }
}
