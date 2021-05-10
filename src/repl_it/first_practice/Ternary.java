package repl_it.first_practice;
import java.util.Scanner;
public class Ternary {
    public static void main (String [] args) {

//        Display x if x is greater than or equal to 5
//        Display -x if x is less than 5 (flip sign - negative/positive)

Scanner scan = new Scanner (System.in);
        System.out.println("Enter number");
        int x = scan.nextInt();
        int greaterLess = (x>=5) ? x : -x;
        System.out.println(greaterLess);





    }
}
