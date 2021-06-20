package day55_abstraction_interface;

public class FreeWeight extends Lifting{


    @Override
    public void perform() {
        System.out.println("Performing free-weight exercises");
    }

    @Override
    public int getCalories(int minutes) {
        return minutes*8;
    }

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack dumbbells");
    }
}
