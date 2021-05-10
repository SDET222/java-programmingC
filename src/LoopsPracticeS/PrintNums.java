package LoopsPracticeS;

public class PrintNums {
    public static void main(String[] args) {

        for (int i = 1; i<=20 ; i++) {

            if (i%3==0) {
                System.out.print(i+" ");
            }

        }

        System.out.println("\n========================================");

        int j=1;
        while ( j <20) {
            j++;
            if (j%3==0) {
                System.out.print(j+" ");
            }
        }


    }
}
