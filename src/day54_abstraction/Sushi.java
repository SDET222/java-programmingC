package day54_abstraction;

public class Sushi extends MenuItem{

    public void prepare() {
        System.out.println("making yummy sushi...");
    }

    public void serve(){
        System.out.println("Serving sushi in Japan");
    }
}
