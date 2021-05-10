package repl_it.arrays_tasks;

import java.util.Arrays;

public class PrintShortest {
    public static void main(String[] args) {

        /**Write a program that will find out shortest words in the given string str.
         * If there are few words that are evenly short, print them all. Use split method in
         * order to split str string variable and create an array of strings. Print array with
         * Arrays.toString() method. Sort array before printing. */

        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

        String[] arrStr = str.split(",");
        String shortest = arrStr[0];
        int count = 0;
        for (int i = 0; i < arrStr.length; i++) {

            if (arrStr[i].length() < shortest.length()) {
                shortest = arrStr[i];
            }
        }
        System.out.println(shortest);

        for (int j = 0; j < arrStr.length; j++) {

            if (arrStr[j].length() == shortest.length()) {
                count++;
            }
        }

        String[] shortestArray = new String[count];
        for (int i = 0, j = 0; i < arrStr.length; i++) {

            if (shortest.length() == arrStr[i].length()) {
                shortestArray[j++] = arrStr[i];
            }

        }
        Arrays.sort(shortestArray);
        System.out.println(Arrays.toString(shortestArray));


    }
}
