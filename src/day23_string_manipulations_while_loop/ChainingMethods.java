package day23_string_manipulations_while_loop;

public class ChainingMethods {
    public static void main(String[] args) {
        String word = "woo den sp oon";

        System.out.println(word.toUpperCase().toLowerCase().length());

        System.out.println(word.replace(" ", "").toUpperCase());

        String city = "cHicaGo";

        System.out.println(city.substring(0, 1).toUpperCase() + city.substring(1));

        String capitalized = city.substring(0, 1).toUpperCase() + city.substring(1).toLowerCase();

        System.out.println(capitalized);

    }
}
