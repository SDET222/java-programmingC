package day22_string_manipulations;

import java.sql.SQLOutput;

public class ReverseUsingCharAt {
    public static void main(String[] args) {

        String word = "Anna";

        System.out.print(word.charAt(word.length()-1));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(1));
        System.out.println(word.charAt(0));
        System.out.println(word);

        String word2 = ""+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);

        System.out.println("word2 = " + word2);

        if (word.equalsIgnoreCase(word2)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }


    }
}
