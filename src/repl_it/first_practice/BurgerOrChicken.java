package repl_it.first_practice;
import java.util.Scanner;
public class BurgerOrChicken {
    public static void main (String [] args) {
//        if the order is burger price is 10.0
//        If the order is chicken price is 10.0
//        If the order is soda price is 2.0
//        If the order is fries price is 3.5

        Scanner scan = new Scanner(System.in);

        String in = scan.next();

        if (in.equals("burger") || in.equals("chicken") ) {
            System.out.println(10.0);
        } else if (in.equals ("soda")) {
            System.out.println("2.0");
        } else if (in.equals ("fries")) {
            System.out.println("3.5");
        }







    }
}
