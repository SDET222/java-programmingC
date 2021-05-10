package day18_conditions_practice_strings_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int score = 120;
        String result = " ";
        if (score >= 1 && score <= 40) {
            result = "D";
        } else if (score > 40 && score <= 60) {
            result = "C";
        } else if (score > 60 && score <= 90) {
            result = "B";
        } else if (score > 90 && score <= 100) {
            result = "A";
        } else {
            System.out.println("Invalid score ");

        }
        System.out.println(result);

    }
}
