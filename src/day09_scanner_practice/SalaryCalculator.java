package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate: ");
        int payPerHour = scan.nextInt();
        int weeklyPay = payPerHour * 40;
        int monthlyPay = weeklyPay * 52 / 12;
        int annualPay = monthlyPay * 12;
        System.out.println("Weekly payment ammount is: $"+weeklyPay);
        System.out.println("Monthly payment ammount is: $"+monthlyPay);
        System.out.println("Annual payment ammount is $" +annualPay);




    }




}
