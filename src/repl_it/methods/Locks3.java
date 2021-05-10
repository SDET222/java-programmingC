package repl_it.methods;

public class Locks3 {
    public static void main(String[] args) {
//It returns true only if both a and b are true or c is true.


    }
    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        if ((a&&b) || c) {
            return true;
        } else {
            return false;
        }
    }


}
