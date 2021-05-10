package saim_tasks.loop_practice;

public class FizzBuzzOddNums {
    public static void main(String[] args) {

        /**Write a program that can print all the ODD numbers between 0 ~ 100
         that can be divisible by 3 & 5 ==>FizzBuzz */

        for(int i =1; i<=100; i++) {
            if(i%2!=0 && i%15==0 ){
                System.out.print(i+", ");
            }

        }
        System.out.println();
        for(int i =1; i<=100; i++) {
            if(i%2==0 && i%15==0 ){
                System.out.print(i+", ");
            }

        }








    }
}
