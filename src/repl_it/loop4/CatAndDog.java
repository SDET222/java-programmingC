package repl_it.loop4;

import java.util.Scanner;

public class CatAndDog {
    public static void main(String[] args) {
        int numOfCat = 0;
        int numOfDog = 0;

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        for (int i = 0; i < word.length() - 2; i++) {
            String part = word.substring(i, i + 3);
            if (part.contains("cat")) {
                numOfCat++;
            }
            if (part.contains("dog")) {
                numOfDog++;
            }

        }
        if (numOfCat == numOfDog) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
