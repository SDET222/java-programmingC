package repl_it.array_list;
import java.util.*;

public class ArraySum {
    public static void main(String[] args) {

        int size = 4;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<size; i++) {
            list.add(5); // +add 2 each iteration 4 times
        }
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum+= list.get(i); // plus 5 four times
        }
        System.out.println(sum);

    }
}
