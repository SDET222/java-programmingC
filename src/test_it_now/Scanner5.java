package test_it_now;
import java.util.Scanner;
public class Scanner5 {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter distance to Miami:");
        double distToMiami = scan.nextDouble();
        System.out.println("Distance to Miami is "+distToMiami+" miles");

        System.out.println("Enter destination:");
        String destination = scan.next();
        System.out.println("Your destination is: " + destination);

        System.out.println("Enter your budget:");
        double budget = scan.nextDouble();
        System.out.println("Your budget is "+budget);







    }






}
