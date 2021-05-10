package day24_while_loop_do_while_for_loop;
import java.util.Scanner;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int secretPin = 1234;
        int pinCode  ;
        int counter = 0;
        do {
            System.out.println("Enter pin code");
             pinCode = scan.nextInt();
             counter++;
             if (counter==5) {
                 System.out.println("Exceed max number of attempts");
                 return;
             }
        } while (pinCode!=secretPin) ;

        System.out.println("Welcome to your account");







    }
}
