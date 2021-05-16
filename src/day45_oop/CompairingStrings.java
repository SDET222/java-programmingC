package day45_oop;

public class CompairingStrings {
    public static void main(String[] args) {


        String word1 = "ferrari"; // in string pool
        String word2 = "ferrari"; // re-use from strig pool
        String word3 = new String("ferrari"); //create in HEAP outside String pool
        String word4 = new String("ferrari"); //create in HEAP outside String pool

        System.out.println(word1==word2); //    TRUE
        System.out.println(word1==word3); //    FALSE

        System.out.println(word1.equals(word2));
        System.out.println(word1.equals(word3));
        System.out.println(word3.equals(word4));
















    }
}
