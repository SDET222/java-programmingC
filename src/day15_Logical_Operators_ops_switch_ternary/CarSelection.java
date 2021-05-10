package day15_Logical_Operators_ops_switch_ternary;

public class CarSelection {
    public static void main(String[] args) {

        double budget = 5_000.0;
        String model = "Honda";
        double carPrice = 4500.0;

        if (carPrice<=budget && model.equals("Toyota") || model.equals("Honda")
                || model.equals("ford")) {
            System.out.println("It works");
        } else {
            System.out.println("I need something different");
        }




    }
}
