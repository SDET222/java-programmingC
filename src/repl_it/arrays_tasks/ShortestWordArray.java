package repl_it.arrays_tasks;
import java.util.*;
public class ShortestWordArray {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        String shortest="";

        for (int i =0; i< str.length; i++) {

            if (str[i].length()>shortest.length()) {
                shortest=str[i];
            }

        }
        System.out.println(shortest);











    }
}
