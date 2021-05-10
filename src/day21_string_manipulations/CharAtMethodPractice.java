package day21_string_manipulations;

public class CharAtMethodPractice {
    public static void main(String[] args) {
        
        
        String word = "java";

        System.out.println("word.charAt(0) = " + word.charAt(0));
        System.out.println("word.charAt(1) = " + word.charAt(1));
        System.out.println("word.charAt(2) = " + word.charAt(2));
        System.out.println("word.charAt(3) = " + word.charAt(3));
        System.out.println(word.length());

        String company = "Cybertek";
        char firstLetter = company.charAt(0);
        char Second = company.charAt(1);
        char Third = company.charAt(2);
        char Four = company.charAt(3);
        char Five = company.charAt(4);
        char Six = company.charAt(5);
        char Seven = company.charAt(6);
        char Eight = company.charAt(7);
        System.out.println("first letter: " + company.charAt(0));
        System.out.println("firsLetter = " + firstLetter);

        System.out.println(firstLetter+" "+Second+" "+Third+
                " "+Four+" "+Five+" "+Six+" "+Seven+" "+Eight);

        String withSpaces = firstLetter+" "+Second+" "+Third+
                " "+Four+" "+Five+" "+Six+" "+Seven+" "+Eight;
        System.out.println("withSpaces = " + withSpaces);

        System.out.println("************************************");








        
        
        
        
        
        
        
        
        
    }
}
