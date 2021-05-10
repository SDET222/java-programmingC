package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {

        String todaysClass = "Jav";

        if (todaysClass.equals("Java"))
            System.out.println("Java is fun");
        else
            System.out.println("It is not Java ti is " + todaysClass);
        System.out.println("******************************");

        int score = 2;

        if (score == 2)
            System.out.println("lowest score 1");
         else if (score == 2)
            System.out.println("score is 2");
         else if (score == 3)
            System.out.println("score is 3");
         else
            System.out.println("other score");
        System.out.println("***************************");

        int a =2;

        if (a==1)
            System.out.println("a is 1");
            System.out.println("1 is a");





    }
}
