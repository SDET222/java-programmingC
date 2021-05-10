package repl_it.arrays_tasks;
import java.util.*;
public class Has55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        boolean has55= true;

        for (int n =0; n<nums.length-1;n++) {
            if (nums[n]==5 && nums[n]==nums[n+1]){
               has55=true;
               break;
            }
            else {
                has55=false;

            }



        }
        System.out.println(has55);

    }








}
