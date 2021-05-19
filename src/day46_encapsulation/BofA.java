package day46_encapsulation;

public class BofA {
    public static void main(String[] args) {

        CheckingAccount acc1 = new CheckingAccount();

        acc1.setAccountHolder("Orkhan Gasimov");
        acc1.setAccountNumber(789111100555l);
        acc1.setBalance(1_000_000);

        System.out.println(acc1);

        CheckingAccount acc2 = new CheckingAccount();

        acc2.setAccountInfo(1215525533,"James Bond","checking",99999.9);

        System.out.println(acc2);






    }
}
