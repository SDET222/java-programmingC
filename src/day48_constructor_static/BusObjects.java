package day48_constructor_static;

public class BusObjects {

    public static void main(String[] args) {

        Bus bus1 = new Bus();

        bus1.driver = new Driver("Eric");

        bus1.engine = new Engine(6);

        System.out.println(bus1);

        Bus metroBus = new Bus();

        metroBus.driver = new Driver("Aziz");

        metroBus.engine = new Engine(12);

        System.out.println("metroBus = " + metroBus);

        System.out.println("metroBus.driver.getName() = " + metroBus.driver.getName());








    }

}
