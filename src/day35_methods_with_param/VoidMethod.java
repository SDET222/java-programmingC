package day35_methods_with_param;

public class VoidMethod {
    public static void main(String[] args) {
        printAtoZ();
        for (int i = 0; i <3 ; i++) {
            printAtoZ();
        }

        displayUSFlag();
        displayUSFlag();displayUSFlag();displayUSFlag();

    }
    public static void printAtoZ() {

        for( char i ='A'; i <='Z'; i++) {
            System.out.print(i+", ");
        }
        System.out.println();
    }

    public static void displayUSFlag() {
        System.out.println("******Flag of USA******");

        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
    }




}
