package test_it_now;

public class calculation {
    public static void main(String[] args) {

        int cents = 167;
        int quarters = cents / 25;        // 6
        int dimes = cents % 25 / 10;           //1
        //               14
        int nickels = cents % 25 % 5;        //0
        int pennies = cents % 5 ;
        System.out.println("quarters = " + quarters); //150
        System.out.println("dimes = " + dimes);  // 10
        System.out.println("nickels = " + nickels); // 1
        System.out.println("pennies = " + pennies); // 2

        System.out.println("hi" + 9);









    }
}
