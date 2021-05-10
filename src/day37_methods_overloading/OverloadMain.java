package day37_methods_overloading;

import java.util.Arrays;

public class OverloadMain {
    public static void main(String[] bargs) {
        System.out.println(main("Hi"));
        main();

        System.out.println( MethodOverloading.sum(2.5,5.7));
        System.out.println(Arrays.toString(bargs));

    }
    public static void main () {
        System.out.println("Hello Main method");
    }
    public static String main (String word) {
        return "Method 'Main'";
    }
}
