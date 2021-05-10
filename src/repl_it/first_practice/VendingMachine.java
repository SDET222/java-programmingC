package repl_it.first_practice;
import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {
        /* Write a program that will determine the change given from the vending machine.
        The program will accept the cents amount and output the change in quarters(25),
         dimes(10), nickels(5), and pennies(1).

The given cents value should be more than 0 and less than 100. If the given cents is not
 in the range print "Invalid cents amount" and there should be no other output after
In valid cases print the change in this format:
Your change is x quarters, x dimes, x nickels, and x pennies

Enter cents:
95
Your change is 3 quarters, 2 dimes, 0 nickels, and 0 pennies
int cents = scan.nextInt();
        int quarters = cents/25;
        int remainderAfterQuarters = cents % 25;
        int dimes = remainderAfterQuarters / 10;
        int remainderAfterDimes = remainderAfterQuarters % 10;
        int nickels = remainderAfterDimes / 5;
        int pennies = remainderAfterDimes % 5;

        if(cents>0 && cents<100){
            System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels, and "+pennies+" pennies");
        }else{
            System.out.println("Invalid cents amount");
        }


         */

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter cents:");
        int cents = scan.nextInt();

        int quarters = cents / 25;
        int remainderAfterQuarters = cents % 25;
        int dimes = remainderAfterQuarters / 10;
        int remainderAfterDimes = remainderAfterQuarters % 10;
        int nickels = remainderAfterDimes / 5;
        int pennies = remainderAfterDimes % 5;

        if (!(cents > 0 && cents < 100)) {
            System.out.println("Invalid cents amount");
        } else {
            System.out.println("Your change is " + quarters + " quarters, " +
                  dimes + " dimes, " + nickels + " nickels, and " +
                    pennies + " pennies");
        }













    }
}
