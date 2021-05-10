package repl_it.arrays_tasks;
import java.util.*;
public class InnerOuter {
    public static void main(String[] args) {

        /**Given two arrays of ints sorted in increasing order, outer and inner,
         *  print out true if all of the numbers in inner appear in outer. Take advantage
         *  of the fact that both arrays are already in sorted order.*/

        Scanner scan = new Scanner(System.in);
//        int sizeInner = scan.nextInt();
//        int sizeOuter = scan.nextInt();
        int[] inner =  {5, 9, 19};    //new int[sizeOuter];
        int[] outer =  {5, 9, 17,19};      //new int[sizeInner];


        int count = 0;

        for (int eachIn:inner) {

            for(int eachOut:outer){
                if(eachIn==eachOut) {
                    count++;
                    break;
                }
            }

        }
        System.out.println(inner.length==count);









    }
}
