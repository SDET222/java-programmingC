package day25_loop_for_loop;
import java.util.Scanner;
public class StartEnd {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and end numbers");
        int start= scan.nextInt();
        int end = scan.nextInt();

        for (int i=start ;  i<=end ; i++ ) {
            System.out.println(i + " ");
            Thread.sleep(1000);

        } if (start>end) {
            System.out.println("reverse is not supported");
        }








    }
}
