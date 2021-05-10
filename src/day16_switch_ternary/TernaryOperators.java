package day16_switch_ternary;

public class TernaryOperators {
    public static void main(String[] args) {


        String result;
        int score = 90;

        if (score>60) {
            System.out.println(result="Pass");
        } else {
            System.out.println(result="fail");
        }
        System.out.println("=========================================");
        int score1 = 49;
        String result1 = (score1 > 60) ? "Pass" : "Fail";
        System.out.println("With ternary - "+result1);





    }
}
