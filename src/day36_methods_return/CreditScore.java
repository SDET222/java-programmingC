package day36_methods_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(700);
        checkEligible(699);
        System.out.println("CreditScore = "+getCreditScore());
        int score = getCreditScore();
        System.out.println("Score = " + score);

    }

    public static void checkEligible (int creditScore) {

        if (creditScore >= 700) {
            System.out.println("You are eligible for leasing this car");
        } else {
            System.out.println("Sorry, you are not eligible for leasing");
        }
    }


        public static int getCreditScore() {
        return 800;
    }



    }


