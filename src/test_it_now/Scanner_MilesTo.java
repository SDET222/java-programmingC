package test_it_now;
import java.util.Scanner;
public class Scanner_MilesTo {
    public static void main (String [] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter destination point:");
        String destination = scan.next();
        System.out.println("Your destination is: "+destination);
        System.out.println("Enter your trip type:");
        String tripType = scan.next();
        System.out.println("Trip type: "+tripType);

        System.out.println("Enter distance:");
        double d1 = scan.nextDouble();
        double tripDuration = d1 / 55;
        System.out.println("Your trip duration is: " + tripDuration + " hours");







    }






}
