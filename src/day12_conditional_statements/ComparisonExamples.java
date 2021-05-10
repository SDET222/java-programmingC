package day12_conditional_statements;

public class ComparisonExamples {
    public static void main (String [] args) {

        int currentSpeed =45, speedLimit =55;
        boolean isSpeeding = currentSpeed >= speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);

        currentSpeed += 20;
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("isSpeeding = " + isSpeeding);

        double accountBalance = 250.25;
        double itemPrice = 100;
        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can I afford it ?: " + canAfford);
        
        accountBalance -= itemPrice;

         canAfford = accountBalance >= itemPrice;
        System.out.println("accountBalance = " + accountBalance);
        System.out.println("Can I afford  ?: " + canAfford);
        boolean isBroke = accountBalance <= 0;
        System.out.println("isBroke = " + isBroke);



    }




}
