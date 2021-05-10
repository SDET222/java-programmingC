package saim_tasks.beforeTasks;
import java.util.Scanner;
public class RemoveFirstAndLast {
    public static void main(String[] args) {
        //Given two words. Print the first word without its first character
        // then print the second word
        //without its last character.
        System.out.println("Enter 1st word:");
        Scanner scan = new Scanner (System.in);
        String word1 = scan.next();
        System.out.println("Enter 2nd word:");
        String word2 = scan.next();

        System.out.println("First word without first char :" + word1.substring(1));
        System.out.println("First word without first char :" + word2.substring(0,
                word2.length()-1));












    }
}
