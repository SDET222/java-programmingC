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

        Roadster r1 = new Roadster("Roadster",200000,2022,620);

        System.out.println(r1);

        r1.drive(1000);
        r1.drive(600);

        System.out.println("Count of electric cars: "+ r1.getCount());

        System.out.println("================================");
        ModelX x = new ModelX("Model X",114690,2021,360);

        System.out.println(x);
        x.drive(40);
        System.out.println("Remaining Range: " + x.getRange());
        System.out.println("Count of electric cars: "+ r1.getCount());


    }

}
