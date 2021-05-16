package day45_oop;

public class CoffeTest {
    public static void main(String[] args) {

        Coffee espresso = new Coffee();

        espresso.Settype("Espresso");
        System.out.println("espresso.getType() = " + espresso.getType());

        System.out.println("espresso.getAmmount() = " + espresso.getAmmount());

        espresso.refill();

        System.out.println("After refill = "+espresso.getAmmount());

        espresso.drink(25);
        System.out.println("after drink 25% = " + espresso.getAmmount());

        //Coffee c = new Coffee;

        espresso.Settype("Turkish coffee");

        System.out.println("my new coffee is "+ espresso.getType());

        System.out.println(espresso.toString());

        Coffee c1 = new Coffee();

        c1.Settype("cappuccino");

        System.out.println("c1 type = " + c1.getType());

        Coffee c2= c1;

        System.out.println("c2 type = " + c2.getType());
        c2.Settype("americano");
        System.out.println("c2.getType() = " + c2.getType());
        System.out.println("c1.getType() = " + c1.getType());

        Coffee c3 = new Coffee();

        c3.Settype("frappucino");


        c3=c2;

        System.out.println("c3 type = " + c3.getType());

        Coffee n4 = null;

        n4.Settype("Java");



    }
}
