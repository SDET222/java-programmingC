package office_hours.may12;

public class Bank {
    public static void main(String[] args) {

      BankAccount bofa = new BankAccount();

      bofa.accountHolderName = "Orkhan Gasimov";
      bofa.pin = 2255;
      bofa.balance = 1_000_000;
      bofa.accountNumber = 1212152521;

        System.out.println(bofa.accountHolderName+": BofA balance is $"+bofa.getBalance(2255));










    }
}
