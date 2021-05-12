package InterviewQuestions;

import java.util.Arrays;

public class SortLettersAndNumbers {
    public static void main(String[] args) {

        String str = "DC501GCCCA098911"; // --> CD015ACCCG011899

        System.out.println(sortLettersAndNumber(str));




    }
    public static String sortLettersAndNumber (String str) {

        String sorted ="";
        String result = "";

        for (int i = 0; i < str.length()-1; i++) {
            if(Character.isLetter(str.charAt(i))) {
                result+=str.charAt(i);
                if(Character.isDigit(str.charAt(i+1))) {
                    result+= "#";
                }
            } else {
                if(Character.isDigit(str.charAt(i))) {
                    result+=str.charAt(i);
                    if(Character.isLetter(str.charAt(i+1))) {
                        result+= "#";
                    }
                }
            }
        }
        String [] arr = result.split("#");

        for (int i = 0; i < arr.length; i++) {

            char [] ch =  arr[i].toCharArray();
            Arrays.sort(ch);

            sorted+=String.valueOf(ch);
        }





        return sorted;
    }

}
