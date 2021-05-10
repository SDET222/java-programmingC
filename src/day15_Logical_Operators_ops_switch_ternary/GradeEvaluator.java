package day15_Logical_Operators_ops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {

        char grade = 'D';

        if (grade==('A') || grade==('B') || grade==('C') ) {
            System.out.println("Passed with grade: " + grade);
        } else if (grade=='D') {
            System.out.println("Qualify for retake");
        } else if (grade=='E') {
            System.out.println("Failed");
        } else {
            System.out.println("Invalid Grade");
        }







    }
}
