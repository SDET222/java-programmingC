package day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConvertion {
    public static void main(String[] args) {

        String word = "Java Coding";
        //System.out.println(word.toLowerCase(Locale.ROOT));
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("CYBERTEK".toLowerCase());
        System.out.println("*********************");

        word.toLowerCase();
        System.out.println(word);

        String wordInLCase = word.toLowerCase();
        System.out.println(wordInLCase);
        System.out.println("==================================");

        word = word.toLowerCase();
        System.out.println(word);
        System.out.println("================================");

        String company = "Amazon Web Services";
        System.out.println(company.toUpperCase());
        System.out.println("Baku Web Services".toUpperCase());

        company = company.toUpperCase();
        System.out.println("company = " + company);




    }
}
