package repl_it.loop4;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**Create a program that will take the given String In and print out
         *  all the vowels from the String. */
        System.out.println("Enter word:");
        String word = scan.next();
        String vowels = "";

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == ('a') || word.charAt(i) == ('e') || word.charAt(i) == ('i')
                    || word.charAt(i) == ('o') || word.charAt(i) == ('u')) {

                vowels += word.charAt(i);
            }
        }
        System.out.println("Vowels: "+vowels);


    }
}
