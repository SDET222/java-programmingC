package repl_it.arrays_tasks;

import java.util.*;
public class Populate {
    public static void main(String[] args) {


        /**The populate method accepts an empty int array and populates it with numbers counting up.*/

        System.out.println(Arrays.toString(populate(new int[20])));






    }

    public static int[] populate(int[] r) {
        for(int i=0, j=1; i<r.length; i++,j++){
            r[i]=j;  //i+1
        }
        return r;
    }
}
