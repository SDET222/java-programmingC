package office_hours;

public class CharIndex {
    public static void main(String[] args) {


        String sentence = "java is fun";

        System.out.println(sentence.charAt(sentence.length()-1));

        System.out.print(sentence.charAt(0));
        System.out.print(sentence.charAt(1));
        System.out.print(sentence.charAt(2));
        System.out.print(sentence.charAt(3));
        System.out.print(sentence.charAt(4));
        System.out.print(sentence.charAt(5));
        System.out.print(sentence.charAt(6));
        System.out.print(sentence.charAt(7));
        System.out.print(sentence.charAt(8));
        System.out.print(sentence.charAt(9));
        System.out.print(sentence.charAt(10));

        System.out.println("****************************");

        String word = "java";

        String upper = ""+word.toUpperCase().charAt(0) + word.toUpperCase().charAt(3);

        System.out.println(upper);





    }
}
