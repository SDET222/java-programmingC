package saim_tasks.beforeTasks;
import java.util.Scanner;
public class MovieDuration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of movie");
        double price = 0;
        double movieLength = input.nextDouble();
        if (movieLength == 1.0) {
            price =8.99;
        }if (movieLength == 1.5) {
            price =10.55;
        }if (movieLength == 2.0) {
            price =12.99;
        }if (movieLength == 2.5) {
            price =14.5;
        }if (movieLength == 3.0) {
            price =15.99;
        }if (movieLength <=0) {
            System.out.println("Invalid length");;
        }
        System.out.println("Price: $" + price);





    }
}
