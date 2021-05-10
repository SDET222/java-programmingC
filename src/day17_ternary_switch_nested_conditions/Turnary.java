package day17_ternary_switch_nested_conditions;

public class Turnary {
    public static void main(String[] args) {

        int score = 90;
        String quality = "good";
        String result = (score > 60) ? "pass" : "fail";
        int rating = (quality.equals("good")) ? 100 : 0;
        char grade = (score > 90) ? 'A' : 'B';
        String evenOdd = (score % 2 == 0) ? "even" : "odd";

        System.out.println("result = " + result);
        System.out.println("grade = " + grade);
        System.out.println("quality = " + quality);
        System.out.println("evenOdd = " + evenOdd);
        System.out.println("rating = " + rating);


    }
}
