package repl_it.methods;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scan.nextInt();
        // 0 1 1 2 3 5 8 13 21 34...

        int [] arr = new int[num+1]; // fibonacci number will be at index of num
        //arr[0] = 0;
        arr[1] = 1; // we start with 0 1

        for (int i =0; i<=arr.length-3; i++) {       // -3 because we take 3 nums at a time. to not go out of bounds

            arr[i+2]=arr[i]+arr[i+1];
            System.out.println(arr[i+2]+" = " + arr[i] + " + " + arr[i+1]);
        }
        System.out.println("Fibonacci number after "+num+" ==> "+arr[arr.length-1]);


    }


}
