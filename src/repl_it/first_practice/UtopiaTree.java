package repl_it.first_practice;

public class UtopiaTree {
    public static void main(String[] args) {

        /**The Utopian Tree grows exactly 1 cm for the first three years,
         * and after that it grows by 2 cm every year.
         Show 10 years of growth of the Utopian Tree. */

        int year = 0;
        int growth = 0;
        int treeSize = 0;

        for (int i = 1; i <= 10; i++) {       // run this from 1 to 10
            year++;                           // increase year by one also 10 times
            if (year <= 3) {                  // esli year <=3
                growth = 1;                   // rost = 1
                treeSize += growth;           // add rost k tree size
                System.out.println("Year " + year + " - growth " + growth + " sm");
                System.out.println("tree size: " + treeSize + " sm");
            } else {
                growth = 2;
                treeSize += growth;
                System.out.println("Year " + year + " - growth " + growth + " sm");
                System.out.println("tree size: " + treeSize + " sm");
            }

        }


    }
}
