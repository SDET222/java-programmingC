package day50_inheritance.OverridingExample;

public class Dog extends Animal {


    public void run() {

        System.out.println("our dog runs fast");
    }
        @Override
    public void speak() {
        System.out.println("Dog is barkling hooowww");
    }

}
