package repl_it.first_practice;
import java.util.Scanner;
public class IfTeacher {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = input.nextLine();
        if (name.equals("Chen")) {
            System.out.println( name +" is teacher");
        } else {
            System.out.println(name +" is not a teacher");
        }



    }



}
