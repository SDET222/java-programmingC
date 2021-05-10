package repl_it.methods;
import java.util.*;
public class ReturnMax {
    public static void main(String[] args) {

        System.out.println(max(11,5));
        System.out.println(max(1,10));
        System.out.println(max(5,5));
    }

    public static int max (int x, int max) {

        if(x>=max){
            return x;
        } else{
            return max;
        }
    }
}
