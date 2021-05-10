package day24_while_loop_do_while_for_loop;
import java.util.Scanner;
public class CountUntil {
    public static void main(String[] args) throws InterruptedException {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int numToStop = input.nextInt();
        int start = 1;

        while (start<=numToStop) {
            System.out.print("Count: " + start++ +", " );
            Thread.sleep(500);
        }
        System.out.println();
        System.out.println("Counted from 1 to " + numToStop);



    }
}
