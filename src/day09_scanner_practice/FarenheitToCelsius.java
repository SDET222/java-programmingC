package day09_scanner_practice;
import java.util.Scanner;
public class FarenheitToCelsius {
    public static void main (String [] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("**********F to C Converter Program*********");
        System.out.println("Enter temp in Farenheit: ");
        double tempInF = scan.nextDouble();
        double fToC = (tempInF - 32) * 5/9;
        System.out.println(tempInF+" in farenheit is "+fToC+" in Celsius");






    }





}
