package day22_string_manipulations;

public class SubstringPractice {
    public static void main(String[] args) {

        String country = "Azerbaijan";

        System.out.println(country.substring(country.length()-3));
        System.out.println(country.substring(2,6));
        System.out.println(country.substring(4));
        System.out.println(country.substring(country.indexOf("z")));

        String word = "java is fun";

        System.out.println(word.substring(0,4));
        System.out.println(word.substring(word.indexOf("i")));





    }
}
