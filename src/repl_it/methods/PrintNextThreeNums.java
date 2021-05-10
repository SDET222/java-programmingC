package repl_it.methods;
import java.util.*;
public class PrintNextThreeNums {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        System.out.println();
        int num = inp.nextInt();
        next3(num);

    }

    public static void next3 (int number) {

        System.out.println("Next three are: ");
        System.out.print(number+1+" ");
        System.out.print(number+2+" ");
        System.out.print(number+3+" ");

    }

}
