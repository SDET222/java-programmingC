package repl_it.first_practice;
import java.util.Scanner;
public class BiggerNumber {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);

//        Write a program that checks for the biggest of 3 numbers.
//                you get 3 int variables: n1 , n2 and n3
//
//        if n1 is biggest output: "n1 is bigger"
//        if n2 is biggest output: "n2 is bigger"
//        if n3 is biggest output: "n3 is bigger"

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("n1 is bigger");

        } else if (n2 > n1 && n2 >n3) {
            System.out.println("n2 is bigger");

        } else if (n3 > n1 && n3 > n2) {
            System.out.println("n3 is bigger");
        }





    }
}
