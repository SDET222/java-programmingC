package repl_it.first_practice;
import java.util.Scanner;
public class VideoGameCoupon {
    public static void main(String[] args) {
        /*The video games machines at your local arcade outputs coupons according to
        how well you play the game.

You can redeem 10 coupons for a candy bar or you can redeem 3 for a gumball
Write a program that displays how many candy bars and gumballs you can get.
 You perfer candy bars.

if you the coupons are not enough for any redeem, display message:
"Not enough coupons"    */

Scanner input = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons = input.nextInt(); //18
        int candy = coupons/10; //1
        int gum = coupons % 10 / 3;

        if (coupons>=3 ) {
            System.out.println("Number of Candies: " + candy );
            System.out.println("Number of Gumballs: " +gum);
        } else {
            System.out.println("Not enough coupons");
        }


        //if (coupons)







    }
}
