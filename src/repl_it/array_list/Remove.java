package repl_it.array_list;
import java.util.*;
public class Remove {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("enter size");
        int size = scan.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("enter number");
            nums.add(scan.nextInt());
        }
        System.out.println(nums);
        nums.remove(0);
        nums.remove(0);
        System.out.println(nums);


    }
}
