package day54_abstraction;

public class Salad extends MenuItem{

    public void prepare() {
        System.out.println("Making salad...in progress...");
    }
    public void serve() {
        System.out.println("serving salad with dressing");
    }

}
