package day55_abstraction_interface.exercise_example;

public abstract class Exercise {

    public void start() {
        System.out.println("Warming up and star exercise");
    }
    public abstract void perform();

    public abstract int getCalories(int minutes);

}
