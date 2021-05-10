package repl_it.arrays_tasks;
import java.util.*;
public class Diving {
    public static void main(String[] args) {

        /**In the sport of diving, seven judges award a score between 0 and 10,
         * where each score may be a floating-point value.

         The highest and lowest scores are thrown out, and the remaining scores are added together.
         The sum is then multiplied by the degree of difficulty for that dive. The degree
         of difficulty ranges from 1.2 to 3.8 points.
         The total is then multiplied by 0.6 to determine the divers score.

         Flow:
         Accept the 7 scores from the judges
         Accept the difficulty number
         Display the final score */

        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        float sum =0f;

        for (int i = 0; i < 7; i++) {
            System.out.println("Enter score for judge "+(i+1)+":");
            score[i] = input.nextFloat();
            sum+=score[i];
        }
        System.out.println("Enter difficulty:");
        float dif = input.nextFloat();
        Arrays.sort(score);
        sum= sum-score[0]-score[score.length-1];

        float result = sum * dif * 0.6f;

        System.out.println("Total: "+result);







    }
}
