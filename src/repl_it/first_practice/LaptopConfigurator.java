package repl_it.first_practice;
import java.util.Scanner;
public class LaptopConfigurator {
    public static void main (String [] args) {


        Scanner scan = new Scanner (System.in);
        double price = 0;
        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();
        if (screenSize==13.3) {
            price+=200;
        } else if (screenSize==15.0) {
            price+=300;
        } else if (screenSize==17.3) {
            price+=400;
        }
        System.out.println("Select CPU type:");
        String cpuType = scan.next();
        if (cpuType.equals("i3")) {
            price+=150;
        } else if (cpuType.equals("i5")){
            price+=250;
        } else if (cpuType.equals("i7"))
            price+=350;
        System.out.println("Select RAM size:");
        int ram = scan.nextInt();
        if (ram>=4) {
            price=price+ram/4*50;
        }
        System.out.println("Select storage type:");
        String storageType = scan.next();

        System.out.println("Enter storage size:");
        int storageSize =scan.nextInt();
        if (storageType.equals("HDD")) {
            price+=storageSize/500*50;
        } else if (storageType.equals ("SSD")) {
            price+=storageSize/500*100;
        }
        System.out.println("Enter screen resolution:");
        String screenResolution = scan.next();
        if (screenResolution.equals("FULLHD")) {
            price+=100;
        } else if (screenResolution.equals("4K")) {
            price+=200;
        }
        System.out.println("Laptop price is: $"+price);


//        If screen size is equals to 13.3, add $200 to the laptop price.
//                If screen size is equals to 15.0 - add $300 to the laptop price.
//                If screen size is equals to 17.3 - add $400 to the laptop price.
//                Then ask user for CPU type.
//
//        If CPU type equals to i3, add $150 to the laptop price.
//                If CPU type equals to i5, add $250 to the laptop price.
//                If CPU type equals to i7, add $350 to the laptop price.
//                Then ask user for RAM size.
//
//        Add $50 for every 4GB of ram to the laptop price.
//                Then, ask user for storage type and size. There are 2 options: SSD and HDD.
//
//                If it's HDD - add $50 to the laptop price for every 500gb.
//        If it's SSD - add $100 to the laptop price for every 500GB.
//        Then ask user for for screen resolution. There are 2 options: FULLHD and 4K.
//
//                Add $100 if it's FULLHD screen
//        Add $200 if it's 4K screen.









    }
}
