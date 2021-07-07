package day60_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        try{
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            System.out.println("Next number is: " + ++num);
            System.exit(0); // finally will not run

        } catch(InputMismatchException e){
            System.out.println("Invalid value");
            System.out.println("Reason: " + e.getCause());

        } finally {
            scan.close();
            System.out.println("finally runs");

        }









    }
}
