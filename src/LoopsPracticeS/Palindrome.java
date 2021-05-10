package LoopsPracticeS;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word:");
        String s = scan.next();
        String reverse = "";
        for (int i = s.length()-1; i >=0 ; i--) {

           reverse+=s.charAt(i);

        }
        System.out.println(s.equalsIgnoreCase(reverse));






    }
}
