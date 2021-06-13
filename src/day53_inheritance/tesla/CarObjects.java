package day53_inheritance.tesla;

public class CarObjects {
    public static void main(String[] args) {

        ElectricCar ec1 = new ElectricCar("Tesla","Model Y",48190.0,2021,326);

        ec1.drive(50);

        System.out.println(ec1);
       // System.out.println(ec1.make); Error: make is private
        System.out.println("ec1 make =" + ec1.getMake());
        System.out.println("ec1 model =" + ec1.getModel());
        System.out.println("ec1 range = "+ ec1.getRange());
        System.out.println("ec1 year = "+ ec1.getYear());

        System.out.println(ElectricCar.getCount());

        ElectricCar ec2 = new ElectricCar("Tesla","Cybertruck",69900.0,2021,300);

        System.out.println(ec2);

        System.out.println(ElectricCar.getCount());








    }

}
