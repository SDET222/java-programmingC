package repl_it.StringManipulations;

import java.util.Scanner;

public class email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        /**Write a program that will print out information about user based on email.
         * Print first name, last name, and domain. First and Last name should be printed
         * with proper format - uppercase first letter and remaining lowercase.
         * craig_federighi@apple.com
         */
        String firstName = email.substring(1, email.indexOf("_"));
        String upperFirst = email.substring(0, 1).toUpperCase();
        String lastName = email.substring(email.indexOf("_") + 2, email.indexOf("@"));
        String upperLast = "" + email.charAt(email.indexOf('_') + 1);
        upperLast = upperLast.toUpperCase();
        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));

        System.out.println("First name: " + upperFirst + firstName);
        System.out.println("Last name: " + upperLast + lastName);
        System.out.println("Domain: " + domain);


    }
}
