package saim_tasks.beforeTasks;
import java.util.Scanner;
public class MiddleChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter word");
        String word = scan.next();

        if (word.length() % 2 == 0){
            System.out.println(""+word.charAt(word.length() / 2 - 1) + word.charAt(word.length() /2 ));
        } else {
            System.out.println(""+word.charAt(word.length() / 2 ) );
        }











    }
}
