package saim_tasks.array_practice;
import java.util.*;
public class EvenOddFromArray {
    public static void main(String[] args) {

      //  int [] numbers = {2, 8, 5, 12, 9};

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you have?");

        int[] numbers = new int [input.nextInt()];

        for (int i=0; i<numbers.length;i++) {
            System.out.println("Enter number " +(i+1));
            numbers[i]=input.nextInt();
        }

        int even =0;
        int odd =0;

        for (int num:numbers) {
            if (num%2==0){
                even++;
            } else {
                odd++;
            }
        }
        int [] evenNumbers = new int[even];
        int [] oddNumbers = new int[odd];

        System.out.println("even = " + even);
        System.out.println("odd = " + odd);

        for (int i=0,e=0, o=0; i<numbers.length;i++) {
            if (numbers[i]%2==0){
                evenNumbers[e++]=numbers[i];

            } else {
                oddNumbers[o++]=numbers[i];
            }

        }
        System.out.println(Arrays.toString(evenNumbers));
        System.out.println(Arrays.toString(oddNumbers));






    }
}
