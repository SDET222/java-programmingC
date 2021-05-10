package day17_ternary_switch_nested_conditions;

public class TeslaSelection {
    public static void main(String[] args) {
        String make = "Tesla"; // Ford / mustang / Explorer
        String model = "X"; // X


        if (make.equals("Tesla")) {
            if (model.equals("S")) {
                System.out.println("Tesla model S");
            }
            else if (model.equals("X")) {
                System.out.println("Tesla model X");
            }
        } else {
             if (make.equals("Ford")) {
                 if (model.equals("Mustang")) {
                     System.out.println("Ford Mustang");
                 } else if (model.equals("Explorer")) {
                     System.out.println("Ford Explorer");
                 }

            }  else {
                 System.out.println("Invalid make");
             }
        }


    }
}
