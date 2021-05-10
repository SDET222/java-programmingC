package saim_tasks.beforeTasks;

import java.util.Scanner;

public class GradeProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Attempt number: ");
        int grade = 100;
        int attempt = input.nextInt();
        if (attempt == 1) {
            System.out.println("Your grade is " + (grade - 10));
        } else if (attempt == 2) {
            System.out.println("Your grade is " + (grade - 20));

        } else if (attempt == 3) {
            System.out.println("Your grade is " + (grade - 35));

        } else {
            System.out.println("Incorrect number of attempts. You have just 3 attempts");
        }
        System.out.println("*****Good Job! Keep it up!*****");


    }
}
