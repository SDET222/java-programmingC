package day28_loops;

import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {

        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZqwertyuiopasdfghjklzxcvbnm1234567890>_|<^#@%&*";

        Random random = new Random();
        String password="";


        for (int i=1; i <=8; i++) {
            int index = random.nextInt(71); // random num 0-70
            System.out.println(source.charAt(index));
            password+= source.charAt(index);
           // System.out.println(random.nextInt(source.length()));
        }
        System.out.println(password);








    }
}
