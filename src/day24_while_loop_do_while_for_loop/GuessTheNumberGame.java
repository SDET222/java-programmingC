package day24_while_loop_do_while_for_loop;
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumberGame {
    public static void main(String[] args) {

        Random randomNum = new Random();
       // System.out.println(randomNum.nextInt(101));
        Scanner scan = new Scanner(System.in);

        int secretNumber = randomNum.nextInt(1000000);
        int guessingNumber;
        do {
            System.out.println("Guess the secret number");
            guessingNumber= randomNum.nextInt(1000000);

            if (guessingNumber>secretNumber) {
                System.out.println("Wrong, your number is too large");
            } else if(guessingNumber<secretNumber) {
                System.out.println("Wrong, your number is too small");

            }
        } while (secretNumber != guessingNumber);
        System.out.println("Congratulation, you won! secret number: " + secretNumber);


//TODO add a counter








    }
}
