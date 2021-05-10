package test_it_now;
import java.util.Scanner;
public class NestedIfPRo {
    public static void main(String[] args) {


        /** Choose Laptop brand => Dell, Asus, Hp >>>or invalid brand
         * model => D1 , D2  /  A1 , A2   /  H1 , H2 >>> or invalid model
         * opSys => i5 , i7 /   i3 , i4   /  i6 , i8 >>> or invalid opSys
         * price=>  500, 700/   600, 800 /  900, 1000
         * result=> brand  + model + opSys + total price : $
         */

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a brand:");

        String brand = scan.nextLine();


        System.out.println("Enter a opSys:");
        String opSys = scan.nextLine();
        int price = 0;

        if (brand.equals("Dell") || brand.equals("Asus") || brand.equals("HP") ) {
            System.out.println("Enter a model:");
            String model = scan.nextLine();
            if (brand.equals("Dell") && model.equals("D1") ) {

            }
        }

//TODO: Nested if!





    }
}
