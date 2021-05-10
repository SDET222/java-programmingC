package repl_it.methods;

public class WaterTax {
    public static void main(String[] args) {
        System.out.println(waterTax(151));


    }
    public static double waterTax (double units) {
        double bill = 0.0;
        if(units<=50) {
            bill =units * 0.60;
            return bill;
        } else if (units>50 &&units<=100) {
             bill =units * 0.90;
            return bill;
        } else if (units>100 &&units<=150) {
            bill=(units * 0.90) + 50;
            return bill;
        } else {
             bill= (units * 0.90) + 100;
            return bill;
        }

    }


}
