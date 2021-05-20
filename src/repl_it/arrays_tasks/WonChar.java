package repl_it.arrays_tasks;

import java.util.Arrays;

public class WonChar {
    public static void main(String[] args) {

        char[] game = {'X','X','X','-','O'};

       // System.out.println(Arrays.toString(won(game)));



    }
    public static String won (char [] x) {

        /**
         * char[] game1 = {
         *   'X', 'X', 'X',
         *   '-', 'O', '-',
         *   '-', 'O', '-'
         * };
         */

        String winner ="";
        for (int i = 0; i < x.length-2; i++) {

            if (x[0]=='X'&& x[1]=='X' && x[2]=='X') {

              winner="Player X won";
            } else {
                winner="Player O won";
            }

        }


        return winner;
    }
}
