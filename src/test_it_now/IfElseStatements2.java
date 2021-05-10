package test_it_now;
import java.util.Scanner;
public class IfElseStatements2 {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();
        if(age>=0 && age <=3) {
            System.out.println("Toddler");
        }
        else if (age >=4 && age <= 15) {
            System.out.println("Kid");
        } else  if (age >=16 && age <=17) {
            System.out.println("Teenager");
        } else if(age>=18 && age <=65) {
            System.out.println("Adult");
        }else {
            System.out.println("Senior");
        }





    }




}
