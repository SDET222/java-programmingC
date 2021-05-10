package day13_conditional_statements;
import java.util.Scanner;
public class ATMPinCode {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to TD Bank ATM!");
        System.out.println("Please enter your PIN");
        int secretPinCode=1234;
        int inputPinCode = input.nextInt() ;

        if(inputPinCode == secretPinCode) {
            System.out.println("Welcome to your account");
            System.out.println("You can withdraw/ check balance/ deposit");

        } else {
            System.out.println("Incorrect Pincode "+inputPinCode);
            System.out.println("Please try again");
        }
        System.out.println("Thank you for using TD Bank");




    }






}
