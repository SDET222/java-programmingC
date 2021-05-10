package LoopsPracticeS;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

/**15 Write a program that can calculate the two numbers based on
 the user provided operators, the program will ask :
 * Enter first number
 * Enter second number
 * Enter the math operators  (assume that only: +, -, / , * and % will be entered)
 * Add condition that divider can not equals to != 0
 * If divider equals == 0, "Invalid number, divider can't be equal to 0!"
 and stop the execution.
 * Ask if the user want's to calculate another numbers?
 * If user entered "yes" it will repeat all previous steps,  otherwise Exit the system
 Note:    You will need to use FOR loop that has true condition without iterator) */

String answer="";
        do {
            System.out.println("Enter first number");
            int num1 = scan.nextInt();
            System.out.println("Enter second number");
            int num2 = scan.nextInt();
            System.out.println("Enter math operator");
            String operator = scan.next();
            int result=0;

            if (operator.equals("/")&& num2==0) {
                System.out.println("Invalid number, divider can't be equal to 0!\"\n" +
                        " and stop the execution.");
                break;
            } else if (operator.equals("+")) {
                System.out.println(num1+num2);

            } else if (operator.equals("-")) {
                System.out.println(num1-num2);
            }else if (operator.equals("*")) {
                System.out.println(num1*num2);
            }else if (operator.equals("/")) {
                System.out.println(num1/num2);
            } else if (operator.equals("%")){
                System.out.println(num1%num2);
            } else {
                System.out.println("INVALID FCN OPRTR");
            }
            System.out.println("Do you want to calculate another numbers?");
            answer = scan.next();



        } while (answer.equals("yes"));







    }
}
