package day10_shorthand_operators;

public class ChangeBalance {
    public static void main (String [] args) {

        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.5;
        System.out.println("baklava = " + baklava);
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);

        double kunefe = 44.45;
        System.out.println("kunefe = " + kunefe);
        balance -=kunefe;
        System.out.println("balance = " + balance);
        kunefe = kunefe / 2;
        System.out.println("kunefe = " + kunefe);
        balance -=kunefe;
        System.out.println("balance after second kunefe= " + balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("balance = " + balance);

        double icedTea = 3.0;
        System.out.println("icedTea = " + icedTea);
        balance = balance - icedTea * 4;
        System.out.println("balance after 4 iced teas = $" + balance);

        System.out.println("Returning baklava = "+baklava);
        balance = balance + baklava;
        System.out.println("Balance after returning baklava = " + balance);






    }





}
