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



    }
}
