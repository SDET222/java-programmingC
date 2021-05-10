package day35_methods_with_param;
import java.util.*;
public class MethodsWithParams {

    public static void displayValue (int num) {
        System.out.println("Value is: "+num);
    }

    public static void main(String[] args) {

        displayValue(15);
        displayValue(19);
        displayValue(99);
        int count = 55;
        displayValue(count);
        greetByName("Murodil");
        greetByName("255X54");

        String name = "Joe";
        greetByName(name);


    }
//    public static void displayArr(String[] arr) {
//
//        System.out.println("Your array: "+ Arrays.toString(arr) );
//    }

    public static void greetByName (String name) {
        System.out.println("Hello "+name+" how are you today?");
    }



}
