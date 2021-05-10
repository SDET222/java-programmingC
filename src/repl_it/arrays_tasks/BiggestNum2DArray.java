package repl_it.arrays_tasks;
import java.util.*;
public class BiggestNum2DArray {
    public static void main(String[] args) {

        /**Given a 2d array of ints, find the biggest number(int) in the array and print it. */

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();

                Arrays.sort(arr[0]);
                Arrays.sort(arr[1]);

                System.out.println(Arrays.toString(arr[0]));


            }
        }
    }
}