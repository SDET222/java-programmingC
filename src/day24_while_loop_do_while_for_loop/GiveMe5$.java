package day24_while_loop_do_while_for_loop;
import java.util.Scanner;
public class GiveMe5$ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me $5");
        int dollars = scan.nextInt();

        while (dollars != 5) {
            System.out.println("Give me $5 dollars" );
             dollars = scan.nextInt();
        }
        System.out.println("Thank you for $5");






    }
}
