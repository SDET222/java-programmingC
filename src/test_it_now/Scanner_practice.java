package test_it_now;

import java.util.Scanner;
public class Scanner_practice {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = scan.next();
        System.out.println("your password is: "+password);

        System.out.println(" Hi! How are you? ");
        String hello = scan.next();
        System.out.println("Answer: "+hello);

        System.out.println("What is your address? :");
        String address = scan.next();
        System.out.println("Your address is: "+address);








    }


}
