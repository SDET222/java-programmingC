package repl_it.arrays_tasks;
import java.util.*;
public class PrintCharsArray {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }

        for (int j=0; j<arr.length; j++) {

            System.out.println(arr[j].charAt(0)+""+arr[j].charAt(1)+arr[j].charAt(2));

        }








    }
}
