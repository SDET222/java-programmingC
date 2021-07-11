package day61_exceptions_collections.errors;

import java.util.ArrayList;
import java.util.List;

public class ErrorExamples {

    public static void main(String[] args) {
        //myMethod();
        List<Integer> nums = new ArrayList<>(); // out of memory
        while(true) {
            nums.add(100);
        }
    }
    static int counter = 0;
    public static void myMethod(){
        System.out.println(counter++);
        myMethod();
    }
}
