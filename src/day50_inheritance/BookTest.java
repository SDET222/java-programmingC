package day50_inheritance;

public class BookTest {

    public static void main(String[] args) {

        Book b1 = new Book();

        b1.author = "Chingiz Abdullayev";
        System.out.println(b1.author);

        b1.price = 19.99;
        System.out.println(b1.price);

        b1.title = "Drongo";
        System.out.println(b1.title);

        b1.type = "detective";

        System.out.println(b1.type);

        Ebook e1 = new Ebook();

        e1.author = "Johnson";

        e1.price = 17.22;
        e1.type = "Selenium automation ebook";
        e1.title = "GoodBook";
        e1.readBook();




        AudioBook audioBook = new AudioBook();

        audioBook.author = "Johnson";
        audioBook.length = 1;
        audioBook.narrator = "Irina";
        audioBook.price = 15.22;
        audioBook.type = "Selenium automation";
        audioBook.title = "CookBook";
        audioBook.listen();









    }

}
