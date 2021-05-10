package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();

    }


    public static void seatInCar() {
        System.out.println("Open the door and seat in driver seat");
    }

    public static void startTheCar() {
        System.out.println("Put the key to ignition");
    }

    public static void shiftToDrive() {
        System.out.println("shift to DRIVE");
    }

    public static void pressGasPedal() {
        System.out.println("press gas and drive trough the city");
    }


}
