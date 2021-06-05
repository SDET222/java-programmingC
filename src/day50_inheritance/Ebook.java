package day50_inheritance;

public class Ebook extends Book{

    int size;
    int pages;

    public void readBook() {
        System.out.println("reading amazing book");
        System.out.println("Title: " + title);
        System.out.println("Size: " + size);
        System.out.println("Pages: "+pages);
        System.out.println("Author: "+author);
        System.out.println("Type: " +type);


    }
}
