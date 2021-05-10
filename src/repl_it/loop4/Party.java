package repl_it.loop4;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String guestList = "";
        String answer = "";

        System.out.println("Please enter guest name:");
        String newGuest = input.next();
        guestList += newGuest + ", ";

        do {
            System.out.println("Do you want to enter new guest name:");
            answer = input.next();

            if (answer.equals("yes")) {

                newGuest = input.next();
                guestList += newGuest + ", ";
            }

        } while (answer.equals("yes"));

        if (answer.equals("no")){
            System.out.println("Guest's list: " + guestList);
        }



    }
}
