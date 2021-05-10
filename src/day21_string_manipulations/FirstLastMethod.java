package day21_string_manipulations;

public class FirstLastMethod {
    public static void main(String[] args) {

        String word1 = "mom";

        if (word1.charAt(0)==word1.charAt(2)){
            System.out.println("first and last letter match");
        }else {
            System.out.println("first and last letter mismatch");
        }

        String word2 = "level";

        char firstLetter = word2.charAt(0);
        char lastLetter = word2.charAt(word2.length()-1);

        System.out.println(firstLetter);
        System.out.println(lastLetter);

        if (firstLetter==lastLetter) {
            System.out.println(word2 + " = first and last letter match");
        } else {
            System.out.println(word2 + " = first and last letter mismatch");
        }





    }
}
