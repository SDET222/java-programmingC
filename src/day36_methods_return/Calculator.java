package day36_methods_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Add " + add(15.2, 5.2));
        System.out.println("subtract " + subtract(15.2, 5.2));
        System.out.println("multiply " + multiply(15.2, 5.2));
        System.out.println("divide " + divide(15.2, 5.2));

        double addition = add(1.5,3.7);
        System.out.println("Addition = "+addition);
        System.out.println("100+200= "+add(100,200));

    }

    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double subtract(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double divide(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }

}
