package day15_Logical_Operators_ops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String [] args) {

     boolean onSale = true;
     boolean freeShipping = true;
     String itemName = "Iphone";


        if(onSale && freeShipping && itemName.equals("Iphone")) {

            System.out.println("Add "+itemName+" to basket.");
        } else {
            System.out.println("Continue shopping for deals on "+itemName+".");
        }

        System.out.println("*********************************************");
        String location = "NY";
        double salary = 120000.0;
        boolean isRemote = true;
        boolean hasBenefits = true;

        if (location.equals("NY") && salary>=100_000 && isRemote && hasBenefits) {
            System.out.println("I'm interested in this job");
        } else {
            System.out.println("Keep job hunting!");
        }









    }




}
