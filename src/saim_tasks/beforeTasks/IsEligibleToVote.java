package saim_tasks.beforeTasks;
import java.util.Scanner;
public class IsEligibleToVote {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age >=18) {
            System.out.println("You are eligible to vote");

        }
        else {
            System.out.println("You are not eligible to vote");
        }
        System.out.println("==============================");

        boolean x = true;
        boolean y = false;
        System.out.println("x = " + !x);
        System.out.println("y = " + !y);




    }
}
