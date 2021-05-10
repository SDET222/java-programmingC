package test_it_now;
import java.util.Scanner;
public class Scanner8 {
    public static void main (String [] args ) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = scan.nextInt();
        boolean isEven = num1 % 2 ==0;
        System.out.println(num1 + " is Even number: " + isEven);





    }




}
