package saim_tasks.nested_loops;

public class BookValue {
    public static void main(String[] args) {

        /**Java textbook By Murodil. Chapter 1 datatypes and variables. Chapter 2
         conditional statements. chapter 3 String manipulation. Chapter 4
         Loops. Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList.
         chapter 8 instance and static. Chapter 9 Constructors. Chapter 10
         Encapsulation and Inheritance. Chapter 11 Abstraction and
         Polymorphism. Chapter 12 Exceptions. Chapter 13 Collections. Chapter
         14 Learn more. */

        String book = "Java textbook By Murodil. Chapter 1 datatypes and variables. Chapter 2\n" +
                "         conditional statements. chapter 3 String manipulation. Chapter 4\n" +
                "         Loops. Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList.\n" +
                "         chapter 8 instance and static. Chapter 9 Constructors. Chapter 10\n" +
                "         Encapsulation and Inheritance. Chapter 11 Abstraction and\n" +
                "         Polymorphism. Chapter 12 Exceptions. Chapter 13 Collections. Chapter\n" +
                "         14 Learn more.";
book=book.toLowerCase();
        int chapters = 0;


        for (int i=0; i <book.length(); i++) {
            if (book.contains("chapter")) {
                chapters++;
                     book=book.replaceFirst("chapter","");
            }


        }
        int value =chapters*10;
        System.out.println(value);











    }
}
