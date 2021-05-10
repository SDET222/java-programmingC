package repl_it.first_practice;
import java.util.Scanner;
public class Time {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter # seconds: ");
        int inputSec = scan.nextInt();

        int  hours, minutes, seconds;
        //inputSec = 3695;
        hours = inputSec/3600;
        int remainingSecAfterHour = inputSec % 3600;
        minutes =remainingSecAfterHour / 60;
        seconds = remainingSecAfterHour % 60;
        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds +
                " seconds.");







    }






}
