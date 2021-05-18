package InterviewQuestions;

public class Array_FindMax {

    public static void main(String[] args) {

        Integer [] numbers = {15,22,99,4,8,175,97};

        System.out.println("maxNum(numbers) = " + maxNum(numbers));

        System.out.println("minNum(numbers) = " + minNum(numbers));


    }
    public static int maxNum (Integer[] nums) {


         int max = Integer.MIN_VALUE;

         for(int each:nums) {
             if(each>max) {
                 max=each;
             }
         }

        return max;
    }

    public static int minNum (Integer [] nums) {

        int min = Integer.MAX_VALUE;

        for(int each:nums) {

            if(each<min) {
                min=each;
            }
        }
        return min;
    }
}
