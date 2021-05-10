package day17_ternary_switch_nested_conditions;

public class AmazonPrimeNestedIf {
    public static void main(String[] args) {
        double itemPrice =15.0;
        boolean isPrimeMember = false;
                                                    //PSEUDOCODE : code written in human language
                                                    //then it will be translated to Java or any other
        if (isPrimeMember) {
            System.out.println("Eligible for 2 day free shipping");
        } else {
            if (itemPrice>=25) {
                System.out.println("Eligible for free regular shipping");
            } else {
                System.out.println("Not eligible for free shipping");
            }
        }






    }
}
