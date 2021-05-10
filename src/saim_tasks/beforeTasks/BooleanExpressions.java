package saim_tasks.beforeTasks;

import java.sql.SQLOutput;

public class BooleanExpressions {
    public static void main (String [] args) {

        int number = 65;
        boolean divisible2 = number % 2==0;
        boolean divisible3 = number % 3==0;
        boolean divisible5 = number % 5==0;

        System.out.println("65 is divisible by 2: " + divisible2);
        System.out.println("65 is divisible by 3: " + divisible3);
        System.out.println("65 is divisible by 5: " + divisible5);




    }

}
