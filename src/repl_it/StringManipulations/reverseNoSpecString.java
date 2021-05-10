package repl_it.StringManipulations;
import java.util.*;
public class reverseNoSpecString {
    public static void main(String[] args) {
        System.out.println(reverseNoSpec("Ab,c,de!$")); //ed,c,bA!$

    }

    public static String reverseNoSpec (String str) {
        str=str.toLowerCase();
        String newS="";
        for(int i =0; i<str.length(); i++) {

            if(Character.isLetter(str.charAt(i))&& Character.isLetter(str.charAt(str.length()-1-i))) {
                newS+=str.charAt(str.length()-1-i);
            } else {
                newS+=str.charAt(i);
            }


        }

        return newS;
    }
}
