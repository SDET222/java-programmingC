package saim_tasks.loop_practice;

import java.util.Random;

public class RandomPassword {
    public static void main (String [] args) {


        String s = "1234567890";
        Random random = new Random();
        String password ="";
        String unique ="";


        for (int i = 0; i<6; i++) {
            int index = random.nextInt(9);


             if (!unique.contains(s.charAt(index)+"")) {
                unique+=s.charAt(index);


            }


        }
        System.out.println(password);





    }
}
