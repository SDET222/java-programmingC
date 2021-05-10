package repl_it.arrays_tasks;
import java.util.*;
public class ZombieAttack1 {
    public static void main(String[] args) {

        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 1};
        int[] inhLeft = new int[inhabitants.length];
        int days = 0;

        for (int i = 0; inhabitants[i] > 0; i++) {

            if (inhabitants[i] > 0) {
                inhLeft[i] = inhabitants[i] / 2;
                days++;
                System.out.println(inhLeft[i]);


            }



        }

    }
}

