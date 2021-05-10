package repl_it.while_loop;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /** In mathematics a factorial of a positive integer n, denoted by n!, is the
         *product of all positive integers less than or equal to n.
         *Calculate factorial and output result to the console.   */

        int n = scan.nextInt(); //5 = 5*4*3*2*1
        long fact = 1;

        while (n>=1) {
            fact= fact * n;
            n--;
        }
        System.out.println(fact);




    }

}
