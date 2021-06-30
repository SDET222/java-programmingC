package day58_polymorphism;

public class Amazon extends OnlineShop implements Prime{

    @Override
    public void buy() {
        System.out.println("buying from amazon.com");
    }

    @Override
    public void sell() {
        System.out.println("Selling on amazon.com");
    }

    @Override
    public void ship() {
        System.out.println("FREE PRIME Shipping from amazon.com");
    }

    @Override
    public void primeShipping() {

    }
}
