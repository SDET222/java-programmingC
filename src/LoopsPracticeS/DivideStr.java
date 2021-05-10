package LoopsPracticeS;
import java.util.Scanner;
public class DivideStr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scan.next();

        System.out.println(name.substring(name.length()/2));
        System.out.println(name.substring(0,name.length() / 2));





    }
}
