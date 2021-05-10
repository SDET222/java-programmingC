package repl_it.first_practice;
import java.util.*;
public class Alejandro1 {
    public static void main(String[] args) {


        /**Alejandro has many emails and only has time to read the emails that refer
         *  to him. Check if his name is found in the email and if it does print "read",
         *  but if his name is not in the email print "don't read" */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter email:");
        String a = scan.nextLine();

        if (a.contains("Alejandro")) {
            System.out.println("read");
        }else {
            System.out.println("don't read");
        }





    }
}
