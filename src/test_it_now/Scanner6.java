package test_it_now;
import java.util.Scanner;
public class Scanner6 {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hours:");
        int hours = scan.nextInt();
        int secInHour = hours * 60*60;
        System.out.println(hours+" hours is : "+secInHour+" seconds");
        System.out.println("Enter days: ");
        int days = scan.nextInt();
        int hoursInDays = days * 24;
        System.out.println(days + " days is: " + hoursInDays + " hours");
        System.out.println("Enter days again:");
        int days1 = scan.nextInt();
        int secInDays = secInHour * hoursInDays * days1;
        System.out.println(days1 + " days is: " + secInDays + " seconds");







    }








}
