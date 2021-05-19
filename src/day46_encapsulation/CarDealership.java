package day46_encapsulation;

public class CarDealership {
    public static void main(String[] args) {

        Car ferrari = new Car();

        ferrari.setMake("Ferrari Roma");
        System.out.println("Make, model: "+ferrari.getMake());

        ferrari.setYear(2021);

        System.out.println("Year: "+ferrari.getYear());

        ferrari.setMileage(1);

        System.out.println("Mileage: "+ferrari.getMileage());

        System.out.println("====================");

        System.out.println(ferrari);

        System.out.println("=====================================");

        Car tesla = new Car();

        tesla.setMake("Tesla Model Y");
        tesla.setYear(2021);
        tesla.setMileage(7);

        System.out.println(tesla);

        System.out.println(tesla.getMake());
        System.out.println(tesla.getYear());
        System.out.println(tesla.getMileage());







    }
}
