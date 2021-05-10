package day19_class_vs_object_strings;

public class LengthOfTheString {
    public static void main(String[] args) {
        String word = "Java";
        System.out.println(word.length());

        String sentence = "Java is Fun";
        System.out.println("sentence.length() = " + sentence.length());
        System.out.println("wooden spoon".length());

        String firstName = "Orkhan";
        System.out.println("First name: " + firstName.length());

        int count = firstName.length();
        System.out.println("count = " + count);
        System.out.println("====================");
        String password = "abc123";
        if (password.length() >= 6) {
            System.out.println("Accepted");
        } else
            System.out.println("Password is too short");


    }
}
