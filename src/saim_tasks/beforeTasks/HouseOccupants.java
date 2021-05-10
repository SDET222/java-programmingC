package saim_tasks.beforeTasks;
import java.util.Scanner;
public class HouseOccupants {
    public static void main(String[] args) {

        /*Given a house type (String) print out the number of max occupants (int)
 Tree house: 1
 Mobile home: 2
 Apartment: 4
 Town house: 6
 Villa: 8
 Mansion: 10
-> Try to use variables instead of printing multiple times */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter house type");
        String houseType = scan.nextLine();
        int occupants = 0;

        switch (houseType) {
            case "Tree house":
                occupants=1;
                break;

            case "Mobile home":
                occupants=2;
                break;

            case "Apartment":
                occupants=4;
                break;

            case "Town house":
                occupants=6;
                break;

            case "Villa":
                occupants=8;
                break;

            case "Mansion":
                occupants=10;
                break;

        }
        System.out.println("Number of occupants is: " + occupants);









    }
}
