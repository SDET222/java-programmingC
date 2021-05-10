package day32_arrays_split;

import java.util.Arrays;

public class ChangeWords {
    public static void main(String[] args) {

        String s = "java is fun";

        String[] sArr = s.split(" ");
String rev = "";
        for (int i = sArr.length - 1; i >= 0; i--) {
            rev+=sArr[i] + " ";

        }

        System.out.println(Arrays.toString(sArr));
        System.out.print(rev.trim());
        System.out.println("\n===================================");

        String word = "java";

        String[] letters = word.split("");

        System.out.println(word.toCharArray());
        System.out.println(Arrays.toString(letters));




    }
}
