package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {

        Worker worker = new SuperMan();
        worker.work("QA");
        worker.getPaid();

        ((SuperMan)worker).playWithKid();

        //DOWNCASTING
        SuperMan superMan = (SuperMan) worker;
        superMan.playWithKid();
        superMan.work("fck");





    }

}
