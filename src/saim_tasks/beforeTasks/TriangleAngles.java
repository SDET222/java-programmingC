package saim_tasks.beforeTasks;
import java.util.Scanner;
public class TriangleAngles {
    public static void main (String [] args) {

        System.out.println("Enter angles of triangle:");
        Scanner input = new Scanner (System.in);
        int angle1 = input.nextInt();
        int angle2 = input.nextInt();
        int angle3 = input.nextInt();
        int angleSum = angle1 + angle2 +angle3;

        if (angleSum ==180) {
            System.out.println("The triangle is valid");
        }
        else {
            System.out.println("The triangle is invalid");
        }

    }


}
