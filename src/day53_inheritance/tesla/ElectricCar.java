package day53_inheritance.tesla;

public class ElectricCar extends Object {
    private String make;
    private String model;
    private double price;
    private int year;
    private int range;
    private static int count;
    public static final int MAX_Range = 400;

    public final void charge() {
        System.out.println("Charging the EV using Super Charge");
        this.range=MAX_Range;
    }



    public ElectricCar(String make, String model, double price, int year, int range) {
         setMake(make);
        this.model = model;
        this.price = price;
        this.year = year;
        this.range = range;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    protected void drive(int miles) {
        if (range==0 || (range-miles)<0){
            System.out.println("Error! Can not drive! need to charge");
        } else {
            range-=miles;
            System.out.println("Driving "+miles+" miles...");
        }

    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make.isEmpty()) {
            System.out.println("Error! can not be blank");
        }else{

        this.make = make;
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
