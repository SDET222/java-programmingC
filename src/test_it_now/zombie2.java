package test_it_now;

import java.util.*;

public class zombie2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(),
        //input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
        //input.nextInt()};

        int[] inhabitants ={2, 9, 0, 4, 7, 0, 7, 6};

        int i = 0;
        int day = 1;

        while (inhabitants[i] != 0) {
            for (i = 1; i < inhabitants.length - 1; i++) {

                if (inhabitants[i + 1] == 0 || inhabitants[i - 1] == 0) {
                    inhabitants[i] = inhabitants[i] / 2;

                } if (inhabitants[1] == 0){
                    inhabitants[0] = inhabitants[0] / 2;

                } if (inhabitants[inhabitants.length - 2] == 0){
                inhabitants[inhabitants.length - 1] = inhabitants[inhabitants.length - 1] / 2;
            }
            }
            if (day == inhabitants.length){
                break;
            }
            System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants));


        }

    }
    }
/*
Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----
 */