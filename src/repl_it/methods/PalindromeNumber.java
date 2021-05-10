package repl_it.methods;
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {

        /**Complete the method isPalindrome() that will check if number is a palindrome.
         *  Print your result as a boolean (true or false).  1001  */
        System.out.println(isPalendrome(4523));


    }
        public static boolean isPalendrome (int num) {
        int temp =num;
        int reversed = 0;
        int renainder =0;

           while(num!=0) {
               renainder=num%10;
               num=num/10;
               reversed=reversed*10+renainder;
           }



        return temp==reversed;


        }

}
//TODO: palindrome num
