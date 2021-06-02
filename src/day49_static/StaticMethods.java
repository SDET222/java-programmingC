package day49_static;

public class StaticMethods {

    int num = 10;
    static int count =5;

    public static void displayMessage(String message) {

        System.out.println("message: " + message);
        // System.out.println(num); will not work ERROR : num is instanse variable. static can't access

        System.out.println("count = "+count);

    }

        public static void staticMethod() {
            System.out.println("another static method");

            displayMessage("from another method -> wooden spoon");
        }

        //create object to use

        public void instanceMethod() {

            System.out.println("instance method running");
            System.out.println("num = " +num);
            System.out.println("count = " +count);
            displayMessage("hello from instance method");
        }




}
