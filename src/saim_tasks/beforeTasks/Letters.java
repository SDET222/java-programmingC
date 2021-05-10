package saim_tasks.beforeTasks;
import java.util.Scanner;
public class Letters {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a character");
        char letter = scan.next().charAt(0);

        if (letter >=65 && letter<=90) {
            System.out.println("Upper case");
        } else if (letter >=97 && letter<=122) {
            System.out.println("Lower case");
        } else {
            System.out.println("Not a character");
        }




    }
}
