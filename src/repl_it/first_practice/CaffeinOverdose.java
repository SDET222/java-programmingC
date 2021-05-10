package repl_it.first_practice;
import java.util.Scanner;
public class CaffeinOverdose {
    public static void main(String[] args) {
/*
Enter number of milligrams in drink:
It would take about 10 drinks for a lethal overdose.
 */
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter number of milligrams in drink:");
        int cafInDrink = scan.nextInt();
        int lethalNum = 1000 / cafInDrink;
        System.out.println("It would take about "+lethalNum+" drinks for lethal overdose.");




    }



}
