package day55_abstraction_interface;

public class Running extends Exercise{


    @Override
    public void perform() {
        System.out.println("Performing running exercise");
    }

    @Override
    public int getCalories(int minutes) {
        return minutes*13;
    }


}
