package day58_polymorphism;

public class SuperMan implements Worker {


    @Override
    public void work(String job) {
        System.out.println("Supermen is working as "+job);
    }

    @Override
    public double getPaid() {
        System.out.println("Superman getting paid");
        return 7500;
    }
}
