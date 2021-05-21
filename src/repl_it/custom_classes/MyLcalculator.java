package repl_it.custom_classes;

public class MyLcalculator {
    public static void main(String[] args) {

        int a = 4;
        int b = 2;

        LameCalculator lc = new LameCalculator();

        System.out.println(lc.plus(a,b));
        System.out.println(lc.minus(a,b));
        System.out.println(lc.divide(a,b));
        System.out.println(lc.multiply(a,b));



    }
}
