package test_it_now;

public class SumOfDigits {
    public static void main(String[] args) {

        String s = "adf2ff3ff5";
        System.out.println(sumOfDigits(s));

    }
    public static int sumOfDigits(String str) {
        int sum = 0;

        for(int i =0; i<str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){

            }
        }
        return sum;
    }
}
