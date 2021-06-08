package day48_constructor_static.composition;


import day48_constructor_static.composition.Driver;
import day48_constructor_static.composition.Engine;

public class Bus {

    Driver driver;
    Engine engine;

    public String toString() {
        return driver.getName() + " | " + engine.getCylinder();
    }


}
