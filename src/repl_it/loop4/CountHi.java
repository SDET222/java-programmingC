package repl_it.loop4;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {
        int numOfHi = 0;
        Scanner scan = new Scanner(System.in);

/**Print out the number of times that the string "hi" appears anywhere in the given string.
 * Only lowercase "hi" should be counted. */

        String s = scan.nextLine();

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.substring(i, i + 2).equals("hi")) {
                numOfHi++;
            }
        }
        System.out.println(numOfHi);


    }
}
