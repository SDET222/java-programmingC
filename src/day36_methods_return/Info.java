package day36_methods_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {

        fullName();
        System.out.println("Full name: "+fullName());
        System.out.println("Is married? "+isMarried());
        System.out.println("Age: "+getAge());
        System.out.println("Year "+getRandomYear());

        String name = fullName();
        boolean isMarried = isMarried();
        int age = getAge();
        int year = getRandomYear();
        System.out.println("name = " + name);
        System.out.println("isMarried = " + isMarried);
        System.out.println("age = " + age);
        System.out.println("year = " + year);

        if (isMarried()) {
            System.out.println("married");
        } else {
            System.out.println("Single");
        }



    }

    public static String fullName () {
        System.out.println("Inside: ");
        return "Mike Smith";
    }
    public static boolean isMarried () {
        return false;
    }

    public static int getAge () {
        return 35;
    }

    public static int getRandomYear() {
        Random random = new Random();
        int randomYear=random.nextInt(2021);
        return randomYear;
    }

}
