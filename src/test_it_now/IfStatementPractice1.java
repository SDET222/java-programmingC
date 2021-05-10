package test_it_now;

import java.sql.SQLOutput;

public class IfStatementPractice1 {
    public static void main (String [] args) {

        int a=10;
        int b=12;
        int c = b + a;

        if (c >= b) {
            System.out.println("C is greater than b");

        }else if (c>25){
            System.out.println("C is greater than 20");
        } else{
            System.out.println("good job");
        }






    }

}
