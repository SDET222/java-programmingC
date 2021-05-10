package repl_it.arrays_tasks;
import java.util.*;
public class Sum {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int sum = 0;

        for (int n:nums) {
            sum+=n;
        }
        System.out.println(sum);






    }
}
