package repl_it.first_practice;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {

        int i = 1;
       // int j = 1;
        String star="";
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (; i<=n; i++) {
             star += "*";
            System.out.println(star);
        }








    }
}
