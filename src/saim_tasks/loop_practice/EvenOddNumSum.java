package saim_tasks.loop_practice;

public class EvenOddNumSum {
    public static void main(String[] args) {

        // Sum of even numbers 1-100
        int num = 1;
        int sumofEven=0;
        int sumOfOdd = 0;

        for (num=1; num<=100;num++) {

            if (num%2==0) {
                sumofEven+=num;
            } else{
                sumOfOdd+=num;

            }


        }
        System.out.println("Sum of even numbers 1-100 is: "+sumofEven);

        System.out.println("Sum of odd numbers 1-100 is: "+sumOfOdd);









}}
