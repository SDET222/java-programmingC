package day49_static;

public class MyBankAccount {

    static double balance = 500.0;
    String user;


    public void spend (double ammount) {
        System.out.println(user+" spending $"+ammount);
        balance-=ammount;
    }

    public void showBalance () {
        System.out.println("Remaining balance: "+balance);
    }

}
