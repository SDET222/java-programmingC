package office_hours.may5;

import java.util.*;

public class ReversLettersOnly {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec(in.nextLine()));











    }
    public static String reverseNoSpec(String str){

       char [] letters = str.toCharArray();
        System.out.println(Arrays.toString(letters));


        for (int i = 0, j=letters.length-1; i < letters.length; i++) {

           if(Character.isLetter(letters[i])) {

             for(;j>=0 ;j--){

                 if(Character.isLetter(letters[j])){

                     char temp = letters[i]; // A
                     letters[i]=letters[j];
                     letters[j--]=temp;
                     break;
                 }

             }

           }

        }
return String.valueOf(letters);

    }
}
