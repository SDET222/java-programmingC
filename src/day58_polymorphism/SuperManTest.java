package day58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {

        Worker man = new SuperMan();
        man.getPaid();
        man.work("SDET");

        Father father = new SuperMan();
        father.feedKid();
        father.playWithKid();
        father.riseKid();

        SuperMan spMan3 = new SuperMan();
        spMan3.getPaid();
        spMan3.work("Scrum master");
        spMan3.feedKid();
        spMan3.playWithKid();
        spMan3.riseKid();












    }
}
