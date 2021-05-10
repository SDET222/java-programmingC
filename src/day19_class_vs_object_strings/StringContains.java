package day19_class_vs_object_strings;

public class StringContains {
    public static void main(String[] args) {

        String company = "Capital One";

        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l O"));
        System.out.println(company.contains(" "));


        if (company.contains(" ")) {
            System.out.println("multiple words company");
        } else {
            System.out.println("Single word name");
        }
 String etsyTitle = "wooden spoon | Etsy";

        if (etsyTitle.contains(" | ")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        String firstName = "Ahmed";

        if (firstName.contains("A") && firstName.contains("e")) {
            System.out.println("Your name is famous");
        } else {
            System.out.println("Your name does not contain \"A\" or \"e\"");
        }

       String name = "Nadir";

        if (name.contains("a") || name.contains("i")) {
            System.out.println("name contains \"a\" or \"i\"");
        } else {
            System.out.println("Name do not contains nether a nor o");
        }
        System.out.println("***************************");

        String email = "jk@gmail.com";

        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }

        if (email.toLowerCase().contains("k")) {
            System.out.println("yes, present");
        }





    }
}
