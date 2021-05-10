package day26_loops;

public class PrintChars {
    public static void main(String[] args) {

        String word = "java";

        for (int i = word.length()-1; i>=0; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.println();

        //String word2 = "python";

        for (int i = 0; i<word.length(); i++) {
            System.out.print(word.charAt(i));
        }



    }
}
