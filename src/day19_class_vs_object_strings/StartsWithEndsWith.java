package day19_class_vs_object_strings;

public class StartsWithEndsWith {
    public static void main(String[] args) {


        String word = "selenium";
        System.out.println(word.startsWith("s"));
        System.out.println(word.startsWith("sel"));
        System.out.println(word.startsWith("l"));
        System.out.println(word.startsWith("S")); // false
        System.out.println(word.endsWith("um"));  // true
        System.out.println("========================================");
        System.out.println(word.contains(" ") ); //
        System.out.println("selenium".startsWith("s"));
        System.out.println("========================================");

        String firstName = "Dr. Nadir";

        if (firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Mr.")) {
            System.out.println("Man");
        }else if (firstName.startsWith("Mrs.")) {
            System.out.println("Married woman");
        } else if (firstName.startsWith("Ms.")) {
            System.out.println("Single woman");
        } else if (firstName.startsWith("Sr.")) {
            System.out.println("Senior");
        } else {
            System.out.println("Invalid shortcut");
        }



    }
}
