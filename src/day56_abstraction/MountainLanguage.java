package day56_abstraction;

public class MountainLanguage implements Greeting{

    @Override
    public void hi() {
        System.out.println("Hi  - Salam Aleykum");
    }

    @Override
    public void bye() {
        System.out.println("Bye  - Sagol");
    }
}
