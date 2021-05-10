package repl_it.first_practice;
import java.util.Scanner;
public class PrefixAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();                    //abXYabc
        int n = scan.nextInt();                         // 1

        if (str.substring(n,str.length()).contains(str.substring(0,n)) ) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
