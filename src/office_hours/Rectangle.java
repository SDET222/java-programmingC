package office_hours;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter length: ");
        double length = input.nextDouble();
        System.out.println("Enter width: ");
        double width = input.nextDouble();

        double perimetr = 2 * (length + width);
        double area = length * width;
        System.out.println("Perimetr = " + perimetr);
        System.out.println("area " + area);



    }







}
