package saim_tasks.beforeTasks;
import java.util.Scanner;
public class MoveWord {
    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your sentence:");
        String s = scan.nextLine();               //Java is a fun language


        String firstWord = s.substring(0, s.indexOf(" "));
        String lastWord = s.substring(s.indexOf(" ")+1);
         System.out.println("firstWord = " + firstWord);
        System.out.println("lastWord = " + lastWord);
        System.out.println(lastWord+ " " + firstWord);










    }
}
