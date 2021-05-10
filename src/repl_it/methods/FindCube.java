package repl_it.methods;
import java.util.*;
public class FindCube {
    public static void main(String[] args) {

cube();

    }



    public static void cube() {
        Scanner scan = new Scanner (System.in);
        int size = scan.nextInt();
        int cubeS = size*size*size;
        System.out.println(cubeS);
    }
}
