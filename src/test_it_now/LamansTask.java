package test_it_now;
import java.util.Scanner;

public class LamansTask {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please,select item snack or drink:");
        String selection = scan.next();


        if (selection.equals("snack")) {
            System.out.println("Chips or hazelnuts?");
            String snackItem = scan.next();
            if (snackItem.equals("chips")) {
                System.out.println("Price is 2.7");
            } else {
                System.out.println("Price is 1.9");

            }

        }
        if (selection.equals("drink")) {
            String drink = "tea";

            System.out.println("Lemon or peach?");
            String drinkItem = scan.next();
            if (drinkItem.equals("lemon")) {
                System.out.println("price is 0.87");
            } else if (drinkItem.equals("peach")) {
                System.out.println("price is 0.89");
            } else {
                System.out.println("wrong item was selected");
            }
        }

    }
}