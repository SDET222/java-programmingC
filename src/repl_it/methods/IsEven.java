package repl_it.methods;
import java.util.*;
public class IsEven {
    public static void main(String[] args) {
        System.out.println(isEven(8));
    }

    public static boolean isEven (int num) {
        if (num%2==0){
            return true;
        } else {
            return false;
        }
    }
}
