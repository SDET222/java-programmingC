package test_it_now;
import java.util.Scanner;
public class Scanner7 {
    public static void main(String [] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        int ageInDays = age * 365;
        System.out.println("You are " + age + " years old. In days, it is "
        + ageInDays + " days.");
        System.out.println("Enter your age again:");
        int age1 = scan.nextInt();
        int age1InDays = age1 * 365;
        int ageInHours = age1InDays * 24;
        System.out.println("You are " + age1 + " years old. In days, it is "
                + age1InDays + " days. \nIn hours, it is: "+ageInHours+" hours." );






    }





}
