package day56_abstraction.drivable;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {


    @Override
    public void transportPeople() {
        System.out.println("Transport people by plane");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane cost = $" + (mile * 21.02) + " to drive "+mile+" miles");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Flying on autopilot mode");
    }

    @Override
    public void hi() {
        System.out.println("Hi from plane");
    }

    @Override
    public void bye() {
        System.out.println("Bye from plane");
    }

    public void land() {
        System.out.println("Plane is landing");
    }
}
