package repl_it.first_practice;

public class EligibleForLoan {
    public static void main(String[] args) {

//        Given two values: yearly salary and credit score determine if you can get a loan.
//
//                To be approve for the loan, print: "Loan Approved":
//        Salary: above 60,000
//        Credit Score: above 650
//        Otherwise print: "Loan Denied"

        double salary = 65_500;
        int creditScore = 740;

        String decision = salary > 60_000 && creditScore > 650 ? "Loan Approved" : "Loan Denied";

        System.out.println(decision);


    }
}
