package repl_it.arrays_tasks;

import java.util.Scanner;

public class PrintingArrays {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        String[] arr = new String[8];
//        for (int i = 0; i < 8; i++) {
           String [] arr = {"apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"};
//        }

        for (int i = 0; i < arr.length ; i+=2) {

                System.out.println(arr[i] + ", " + arr[i + 1]);

        }


    }
}
