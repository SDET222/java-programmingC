package day50_inheritance;

public class AudioBook extends Book{

    int length;
    String narrator;

    public void listen() {
        System.out.println("Liostening my audiobook");
        System.out.println("Length: "+ length+" minutes");
        System.out.println("Narrator: "+ narrator);
        System.out.println("Author: "+author);

    }

}
