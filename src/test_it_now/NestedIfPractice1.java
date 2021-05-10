package test_it_now;
import java.util.Scanner;
public class NestedIfPractice1 {
    public static void main(String[] args) {

        /** Given :
         * House location : US house
         * if hl is not US => "not US house"
         * House type : Single family, Multi family, Condo
         * if multi family => ask how many family
         * if 2 => "house for 2 family"
         * if 3 or more => "Huge house"
         * if Single family => "house for one family"
         * if Condo => ask "is it fun to live in condo"
         * if yes => "Great! enjoy"
         * if not => "Consider moving out"
         */

        Scanner scan = new Scanner (System.in);



        System.out.println("Enter house location:");
        String houseLocation = scan.next();
        if (houseLocation.equals("US")) {
            System.out.println("Enter type:");
            String houseType = scan.next();
            if (houseType.equals("Single_family")){
                System.out.println("House for one family");

            } else if(houseType.equals("Multifamily")) {
                System.out.println("How many family?");
                int familyCount = scan.nextInt();
                if (familyCount==2) {
                    System.out.println("House for two family");
                } else if (familyCount>=3) {
                    System.out.println("Huge house");
                }
            } else if (houseType.equals("Condo")) {
                System.out.println("is it fun to live in condo?");
                String isCondoFun = scan.next();
                if (isCondoFun.equals("Yes")) {
                    System.out.println("Great! enjoy");
                } else {
                    System.out.println("Consider moving out from Condo");
                }
            }
        } else {
            System.out.println("not US house");
        }








    }
}
