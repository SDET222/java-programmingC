package test_it_now;

public class StringPassword {

    public static void main(String[] args) {

        char upperCase = (char)(65 + (Math.random() * 24));
        char lowerCase = (char)(97 + (Math.random() * 24));
        int random = (int)(1000 + (Math.random() * 9000));

        System.out.println("Random password is " + upperCase + lowerCase + random);


    }
}
