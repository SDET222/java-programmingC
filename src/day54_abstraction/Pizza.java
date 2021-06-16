package day54_abstraction;

public class Pizza extends MenuItem{

    public  void prepare() {
        System.out.println("Prepearing pizza in oven");
    }
    public void serve() {
        System.out.println("Serving pizza");
    }
}
