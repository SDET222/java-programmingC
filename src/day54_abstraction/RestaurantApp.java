package day54_abstraction;

public class RestaurantApp {
    public static void main(String[] args) {

        Pizza pizza = new Pizza();
        Sushi sushi = new Sushi();
        Salad salad = new Salad();

        pizza.prepare();
        pizza.serve();
        System.out.println("==============");

        sushi.prepare();
        sushi.serve();
        System.out.println("==============");

        salad.prepare();
        salad.serve();





    }
}
