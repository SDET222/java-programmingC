package test_it_now;
import java.util.Scanner;
public class Scanner9 {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter distance:");
        double dist = scan.nextDouble();
        System.out.println("Enter speed:");
        double speed = scan.nextInt();
        double time = dist / speed;
        System.out.println("You will be at your destination in "+time+" hours");




    }




}
