package test_it_now;

import java.util.*;

public class Choose_Laptop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int price = 0;

        System.out.println("Choose laptop brand :");
        String brand = scan.next();

        if (brand.equals("Dell")) {
            System.out.println("Choose model:");
            String model = scan.next();
            if (model.equals("D1")) {
                System.out.println("Choose operator system:");
                String opSys = scan.next();

                if (opSys.equals("i5")) {
                    price += 500;
                    System.out.println("Result: " + brand + " " + model + " " + opSys + " total price: $" + price);
                } else if (opSys.equals("i7")) {
                    price += 700;
                    System.out.println("Result: " + brand + " " + model + " " + opSys + " total price: $" + price);

                } else {
                    System.out.println("Invalid opSys");
                }
            } else if (model.equals("D2")) {
                System.out.println("Choose operator system:");
                String opSys = scan.next();
                if (opSys.equals("i5")) {
                    price += 500;
                    System.out.println("Result: " + brand + " " + model + " " + opSys + " total price: $" + price);
                } else if (opSys.equals("i7")) {
                    price += 700;
                    System.out.println("Result: " + brand + " " + model + " " + opSys + " total price: $" + price);
                } else {
                    System.out.println("Invalid opSys");
                }

            } else {
                System.out.println("Invalid model");
            }
        } else if (brand.equals("Asus")) {
            System.out.println("Choose model:");
            String model = scan.next();
            if (model.equals("A1")) {
                System.out.println("Choose operator system:");
                String opSys = scan.next();

                if (opSys.equals("i3")) {
                    price += 600;
                    System.out.println("Result: " + brand + " " + model + " " + opSys + " total price: $" + price);
                } else if (opSys.equals("i4")) {
                    price += 800;
                    System.out.println("Result: " + brand + " " + model + " " + opSys + " total price: $" + price);
                } else {
                    System.out.println("Invalid opSys");
                }
            } else if (model.equals("A2")) {
                System.out.println("Choose operator system:");
                String opSys = scan.next();
                if (opSys.equals("i3")) {
                    price += 600;
                    System.out.println("Result: " + brand + " " + model + " " + opSys + " total price: $" + price);
                } else if (opSys.equals("i4")) {
                    price += 800;
                    System.out.println("Result: " + brand + " " + model + " " + opSys + " total price: $" + price);
                } else {
                    System.out.println("Invalid opSys");
                }

            } else {
                System.out.println("invalid model");
            }
        } else if (brand.equals("HP")) {
            System.out.println("Choose model:");
            String model = scan.next();
            if (model.equals("H1")) {
                System.out.println("Choose operator system:");
                String opSys = scan.next();

                if (opSys.equals("i6")) {
                    price += 900;
                    System.out.println("Result: " + brand + " " + model + " " + opSys + " total price: $" + price);
                } else if (opSys.equals("i8")) {
                    price += 1000;
                    System.out.println("Result: " + brand + " " + model + " " + opSys + " total price: $" + price);

                } else {
                    System.out.println("Invalid opSys");
                }
            } else if (model.equals("H2")) {
                System.out.println("Choose operator system:");
                String opSys = scan.next();
                if (opSys.equals("i6")) {
                    price += 900;
                    System.out.println("Result: " + brand + " " + model + " " + opSys + " total price: $" + price);
                } else if (opSys.equals("i8")) {
                    price += 1000;
                    System.out.println("Result: " + brand + " " + model + " " + opSys + " total price: $" + price);
                } else {
                    System.out.println("Invalid opSys");
                }

            } else {
                System.out.println("Invalid model");
            }

        } else {
            System.out.println("Invalid brand");
        }
    }
}
