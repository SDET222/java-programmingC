package InterviewQuestions;

public class SumOfDigitsInString {

    public static void main(String[] args) {

        String str = "ABC4D5";
        System.out.println(sumOfDigits(str));

    }
    public static int sumOfDigits (String str) {
        //"ABC4D5F3S" --> 12
        int sum=0;
        char [] ch = str.toCharArray();

        for (char each:ch) {

            if(Character.isDigit(each)) {
                sum+=Integer.valueOf(""+each);
            }

        }


        return sum;
    }
}
