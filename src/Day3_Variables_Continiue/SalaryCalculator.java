package Day3_Variables_Continiue;

public class SalaryCalculator {
    public static void main(String[] args){
        /*rate=55
        stateTaxRate=0.04
        federalTaxRate=0.22
        weeklyHours=40
        ---------------
        Output
        salary is:105600
        total tax:27456
        income after tax:78144
         */
        double rate=45.5;
        double stateTaxRate=0.04;
        double federalTaxRate=0.22;
        byte weeklyHours=40;
        byte totalWeeks=52;
        double salary=weeklyHours*rate*totalWeeks; //total salary before tax
        double stateTax=salary*stateTaxRate;
        double federalTax=salary*federalTaxRate;
        double totalTax=federalTax+stateTax;

        double salaryAfterTax= salary-totalTax; // salary after tax

        System.out.println("Your salary is $"+salary);// concatenation
        System.out.println("State tax is   $"+stateTax);
        System.out.println("Federal tax is $"+federalTax);
        System.out.println("Total tax is   $"+totalTax); //runs from left to run!
        //                                  String+ stateTax
        System.out.println("Salary after tax is $"+salaryAfterTax);








        }







    }






