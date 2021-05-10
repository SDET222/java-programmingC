package saim_tasks.loop_practice;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {


        Scanner scan =new Scanner (System.in);
        System.out.println("Enter word:");
        String word = scan.next();//java
        String word2 ="";

        for (int i =word.length()-1 ; i >=0; i--) {

            word2+=word.charAt(i);
        }
        System.out.println(word2.equals(word));


        String word5 = "annam";
        boolean isPalendrome = true;

        for (int i = 0; i < word5.length()/2; i++) {

            if (word5.charAt(i)!=word5.charAt(word5.length()-1-i)){
                isPalendrome=false;
                break;
            }

        }
        System.out.println(isPalendrome);







    }
}
