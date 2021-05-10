package day09_scanner_practice;
import java.util.Scanner;
public class AskAge {
    public static void main (String[] args) {
        byte age = 37;
        System.out.println("How old are you?");
        System.out.println("I am "+age+" years old.");


        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int age1 = scan.nextInt();
        System.out.println("I am "+age1+" years old.");







    }





}
