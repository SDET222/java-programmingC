package repl_it.first_practice;
import java.util.Scanner;
public class Ternary2 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
//        Write an expression using the ternary that compares the values of the
//        variables num1 and num2.
//        The result from the ternary should be the bigger number from the two numbers.

        System.out.println("Enter number 1");
        int num1 = scan.nextInt();

        System.out.println("Enter number 2");
        int num2 = scan.nextInt();

       int biggerNum = num1>num2 ? num1 : num2;
        System.out.println(biggerNum);



    }
}
