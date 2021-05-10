package review;
import java.util.*;
public class WrapperClass {
    public static void main(String[] args) {

        int num1 = 12345;
        Integer n1 = num1;

        String nS= n1.toString();
        String neString="";

        for (int i = nS.length()-1; i >=0 ; i--) {
            neString+=nS.charAt(i);
        }
        System.out.println(neString+"A");

        String word = "This is new word 43 and number";
        String [] arr = word.split(" ");
        for (int i =0; i<arr.length; i++) {
            if (arr[i].isEmpty()) {
                System.out.println("is Empty");
            }
            System.out.println(arr[i]);
        }

        String word2 = "This is new word 43 and numbers";





    }
}
