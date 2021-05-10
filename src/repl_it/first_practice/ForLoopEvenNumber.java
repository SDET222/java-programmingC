package repl_it.first_practice;

public class ForLoopEvenNumber {
    public static void main(String[] args) {


        /**Write a for loop that prints all even integers from 80 through and including 20.
         *        Seperate each number with a space
         */

        String evenNum = "";

        for (int n = 20; n<=80; n++) {
            if (n%2==0) {
                evenNum += n+" ";
            }
        }
        System.out.println(evenNum);






         }
}
