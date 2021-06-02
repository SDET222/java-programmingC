package day49_static;

import office_hours.may12.BankAccount;

public class BankAccountTest {
    public static void main(String[] args) {

        MyBankAccount main1 = new MyBankAccount();

        main1.user ="John";

        main1.spend(150.0);
        main1.showBalance();

        MyBankAccount wife = new MyBankAccount();

        wife.user = "wife";

        wife.showBalance();

        wife.spend(80);

        wife.showBalance();

        main1.showBalance();

        System.out.println(MyBankAccount.balance);


       // System.out.println("MyBankAccount.balance = " + MyBankAccount.balance);






    }
}
