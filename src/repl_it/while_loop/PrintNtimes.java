package repl_it.while_loop;

import java.util.Scanner;

public class PrintNtimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int count = 1;

        while (n >= count) {

            System.out.print("*");

            count++;
        }

        System.out.println();


    }
}
