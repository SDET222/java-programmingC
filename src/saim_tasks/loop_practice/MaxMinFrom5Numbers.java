package saim_tasks.loop_practice;
import java.util.Scanner;
public class MaxMinFrom5Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            /** Write a program that can ask the user "enter a number" five times
                and return the maximum number */
        int maxNum = -2147483647;
        int minNum = 2147483647;
            for (int i = 1; i<=5; i++) {
                System.out.println("Enter a number");
                int num = scan.nextInt();
                if (maxNum<=num) {
                    maxNum=num;
                } if (minNum>=num) {
                  minNum=num;
                }
            }
        System.out.println("maxNum = " + maxNum);
        System.out.println("minNum = " + minNum);












    }
}
