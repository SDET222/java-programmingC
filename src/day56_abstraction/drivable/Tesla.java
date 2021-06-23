package day56_abstraction.drivable;

import day56_abstraction.greeting.Greeting;

public class Tesla extends Transportation implements SelfDrivable, Greeting
{


    @Override
    public void transportPeople() {
        System.out.println("Transporting people driving Tesla");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla cost = $" + (mile * 0.10) + " to drive "+mile+" miles");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Tesla is driving an autonomous mode");
    }

    @Override
    public void hi() {
        System.out.println("Tesla says HI!");
    }

    @Override
    public void bye() {
        System.out.println("Tesla says BYE!");
    }


}
