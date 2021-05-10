package repl_it.first_practice;
import java.util.Scanner;
public class Reverse {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        /**
         * Write a program that will reverse a string. Your program should reverse
         * a string only 5 characters long.
         * If word is shorter, display message: "Too short!". If word is longer,
         * display message: "Too long!". Otherwise, reverse this word and
         * print out result into the console.
         */

        System.out.println("Enter a word:");
        String word = scan.next();

        if (word.length() < 5) {
            System.out.println("Too short");

        } else if (word.length() > 5) {
            System.out.println("Too long");

        } else if (word.length() == 5) {
            System.out.print(word.charAt(word.length()-1));
            System.out.print(word.charAt(word.length()-2));
            System.out.print(word.charAt(word.length()-3));
            System.out.print(word.charAt(word.length()-4));
            System.out.print(word.charAt(word.length()-5));
        }




    }
}
