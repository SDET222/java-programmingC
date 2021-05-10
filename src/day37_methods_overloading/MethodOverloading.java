package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1.5,2));
        System.out.println(sum(1,2,15));
        System.out.println(sum("Hello", "World!"));
    }

    public static int sum(int num1, int num2) {
        System.out.println("sum (int num1, int num2)");
        System.out.println("Result= "+(num1+num2));
        return num1+num2;

    }

    public static double sum(double num1, double num2) {
        return num1+num2;
    }
    public static int sum(int num1, int num2, int num3) {
        return num1+num2+num3;
    }
    public static String sum(String num1, String num2) {
        return num1+" "+num2;
    }

}
