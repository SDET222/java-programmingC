package repl_it.arrays_tasks;
import java.util.*;
public class AvarageTemp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        double average = 0;
        double sum = 0;

        for (double each:temps) {
            sum+=each;

        } average = sum / temps.length;
        System.out.println("Average temp is: " + average);










    }
}
