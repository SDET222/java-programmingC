package repl_it.StringManipulations;

import java.util.Scanner;

public class WithoutXx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**Given a string word, if the first or last chars are 'x' or 'X',
         *  print the string without those 'x' or 'X' chars, otherwise print the string unchanged.
         */
        String word = scan.next();
        String word2 = word.toLowerCase();

        if (word2.charAt(0)=='x' && word2.charAt(word2.length()-1)=='x') {
            System.out.println(word.substring(1, word.length()-1));
        }
        else if (word2.charAt(0)=='x') {
            System.out.println(word.substring(1));
        }
        else if (word2.charAt(word.length()-1)=='x') {
            System.out.println(word.substring(0,word.length()-1));
        } else {
            System.out.println(word);
        }


    }
}
