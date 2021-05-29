package day48_constructor_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator.add(2,3); // static method, no object needed

        Calculator c = new Calculator();   // instance/object method
        // non static, must create object to use this method

        c.multiply(2,2);






    }
}
