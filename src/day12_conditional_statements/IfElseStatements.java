package day12_conditional_statements;

public class IfElseStatements {
    public static void main (String [] args) {

        if(10 > 5) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }
        int count = 25;
        // check if count  > 30. if yes print "count > 30"
        // otherwise print " count < 30"
        if (count>30) {
            System.out.println("count is more than 30");
        } else {
            System.out.println("count is less than 30");
        }
        byte age = 25;
        if(age>=18) {
            System.out.println("You are eligible to vote");
            System.out.println("Your age is greater or equal 18");
        } else {
            System.out.println("You are not eligible to vote");
            System.out.println("Your age is less than 18");
        }







    }





}
