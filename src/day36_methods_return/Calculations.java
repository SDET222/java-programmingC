package day36_methods_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("Calculator from other class");
        System.out.println("ADD - "+Calculator.add(12,5) );
        System.out.println("subtract- "+Calculator.subtract(20,10));
        System.out.println("multiply- "+Calculator.multiply(3,25));
        System.out.println("divide - "+Calculator.divide(100,2));

        System.out.println("100-40 = " + Calculator.subtract(100,45));
        System.out.println("100 / 40 = " + Calculator.divide(100,40));

        double d1= 234.5;
        double d2 = 145.3;
        double result = Calculator.subtract(d1,d2);
        System.out.println("Result from variables = "+result);

    }

}
