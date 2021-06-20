package day55_abstraction_interface;

public class Swimming extends Exercise{

    @Override
    public void perform() {
        System.out.println("Performing swimming in a pool");
    }

    @Override
    public int getCalories(int minutes) {
        return minutes*11;
    }


}
