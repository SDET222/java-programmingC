package day53_inheritance.tesla;

public class ModelX extends ElectricCar {


    public ModelX(String model, double price, int year, int range) {
        super("Tesla", model, price, year, range);
    }

    /**
     * ERROR because charge is final METHod can;t be overridden
     */
    //public void charge() {

   // }


}
