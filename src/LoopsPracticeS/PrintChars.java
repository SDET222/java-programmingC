package LoopsPracticeS;

public class PrintChars {
    public static void main(String[] args) {

        for(char i = 'A'; i <= 'Z'; i++) {


            if (i=='Y'|| i=='H'|| i=='J' || i=='Z') {
                continue;
            } else {
                System.out.print(""+i+" ");
            }



        }








    }
}
