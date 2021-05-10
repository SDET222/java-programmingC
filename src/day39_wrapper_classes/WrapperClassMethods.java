package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {


        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(12,22));
        System.out.println(Integer.min(15,2));
        System.out.println(Integer.compare(55,11));
        System.out.println("Minimum Integer: " + Integer.MIN_VALUE);
        System.out.println("Maximum Integer: " + Integer.MAX_VALUE);

        System.out.println(Double.max(25.2,33.9));
        System.out.println("Minimum Double: " + Double.MIN_VALUE);
        System.out.println("Maximum Double: " + Double.MAX_VALUE);

        System.out.println(Double.compare(5,1));
        System.out.println(Double.compare(5,5));
        System.out.println(Double.compare(5,7));

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('.'));
        System.out.println(Character.isAlphabetic('w'));
        System.out.println("Is letter = "+Character.isLetter('9'));
        System.out.println("Is uppercase = "+Character.isUpperCase('A'));
        char letter = 'A';


        if(Character.isUpperCase(letter)){
            System.out.println("UpperCase");
        }
        System.out.println("===========Only UpperCase=============");
String word = "JavA iS FuN";
        for (int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i)+", ");
            }
        }
        System.out.println("\n===========================");
        System.out.println("space = "+Character.isSpaceChar(' '));
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        System.out.println(Boolean.TRUE.equals(5>3));

        //Convert String into number --> parse or valueOf methods is wrapper classes













    }
}
