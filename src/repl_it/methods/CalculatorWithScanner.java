package repl_it.methods;
import java.util.*;
public class CalculatorWithScanner {
    public static void main(String[] args) {
            plus();
    }

    public static void plus () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();
        int result = num1+num2;
        System.out.println("result: "+result);
    }

}

