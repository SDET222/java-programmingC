package day60_exceptions;

public class StringIndexIssue {
    public static void main(String[] args) {

        String word = "java";

        System.out.println(word);
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(2));


        try{

            System.out.println(word.charAt(10));
        } catch (Exception e) {
            System.out.println("Exception happened --> " + e.getMessage());
        }
        System.out.println(word.toUpperCase());

        String word2 = "Selenium";
        System.out.println("word2 = " + word2);

        System.out.println(word2.substring(0,5));

        try {
            System.out.println(word2.substring(0,19));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Another exception caught -->" + e.getMessage());
            System.out.println("Another exception caught -->" + e.getClass().getSimpleName());

        }



    }
}
