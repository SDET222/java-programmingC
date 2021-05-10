package repl_it.arrays_tasks;

public class CountOfEvens {
    public static void main(String[] args) {
        /**Given an array nums, count and print the number of even numbers in the array */


        int[] nums = {3, 17, 14, 8, 42, 31};
        int count=0;

        for(int n:nums) {

            if (n%2==0){
                count++;
            }
        }
        System.out.println(count);







    }
}
