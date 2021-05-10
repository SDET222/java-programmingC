package LoopsPracticeS;
import java.util.*;
public class MinMaxNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int minNum= 999999999;
        int maxNum=-999999999;

        for (int i=1; i <=10; i++) {
            System.out.println("Enter  number:");
            int num = scan.nextInt();
            if (num<minNum) {
                minNum=num;
            } if (num>maxNum) {
                maxNum=num;
            }



        }System.out.println("Min num "+ minNum);
        System.out.println("Max num "+ maxNum);








    }
}
