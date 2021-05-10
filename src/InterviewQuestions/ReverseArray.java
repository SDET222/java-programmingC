package InterviewQuestions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        String[] arr3 = {"java", "easy" , "learn" };

        System.out.println(Arrays.toString(reverseArray(arr3)));




    }
    public static String[] reverseArray (String [] arr1) {
       String [] reversed = new String[arr1.length];

        for (int i = arr1.length-1, j=0; i >=0 ; i--, j++) {
            reversed[j]=arr1[i];
        }

        return reversed;
    }

}
