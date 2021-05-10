package day33_arrays;
import java.util.*;
public class RegEx {
    public static void main(String[] args) {

        String  word = "java1html2sql";

        String [] strArr = word.split("\\d");

        System.out.println(Arrays.toString(strArr));


        word=word.replaceAll("\\d" , "_");
        System.out.println(word);

        System.out.println();
        System.out.println("************************************");

        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }


    }
}
