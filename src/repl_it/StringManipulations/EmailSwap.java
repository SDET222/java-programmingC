package repl_it.StringManipulations;

import java.util.Scanner;

public class EmailSwap {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //mike_tyson@gmail.com



        if (email.contains("_")) {
            String firstName = email.substring(0, email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"));
            String underScore = "_";
            System.out.println(lastName + underScore + firstName + domain);
        } else {
            System.out.println(email);
        }


    }
}
