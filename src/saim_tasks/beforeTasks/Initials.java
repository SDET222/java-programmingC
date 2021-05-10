package saim_tasks.beforeTasks;
import java.util.Scanner;
public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter your name");
        String name = scan.nextLine();

        String initial1 =  name.substring(0,1).toUpperCase() ;
        String initial2 = ""+ name.charAt(name.indexOf(" ")+1);
        initial2=initial2.toUpperCase();

        System.out.println();
        System.out.println("Your initials are: " + initial1 + initial2);









    }
}
