package repl_it.methods;

public class FindMaxMethodOverloading {
    public static void main(String[] args) {
/**In this task, you need to write 2 overloaded methods findMax() that will find a maximum
 *  number in the array. First version should work with array of integers (int[]) and return int,
 *  and second method should work with an array of doubles (double[]) and return double as a
 *  result.*/
    int[] n = {15,4,78,54,32};
    double [] d = {22.5, 5.4, 2.1, 78.1};
        System.out.println(findMax(n));
        System.out.println(findMax(d));

    }
    public static int findMax (int[] n) {
        int maxN = n[0];
        for(int each:n){
            if(each>maxN){
                maxN=each;
            }
        }
        return maxN;
    }
        public static double findMax (double [] d) {
        double maxD = d[0];
        for (double each:d) {
            if(each>maxD) {
                maxD=each;
            }
        }
        return maxD;
        }

}
