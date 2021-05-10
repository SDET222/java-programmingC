package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main (String [] args) {

        String carModel = "Toyota";
        String driverName = "Orkhan";
        String licenseNum = "G74498852";
        int speed = 120;
        boolean isAutomatic = true;
        char dlClass = 'D' ;
        System.out.println("Model:       "+carModel);
        System.out.println("Driver Name: "+ driverName);
        System.out.println("DL number:   "+licenseNum);
        System.out.println("Class :      "+dlClass);
        System.out.println("Speed:       "+speed+"mph");
        System.out.println("Is transmission automatic ? : "+isAutomatic);
        System.out.println("======================");
        System.out.println(driverName+" is driving "+carModel);
        System.out.println(driverName+" is driving "+carModel+" and have a license number " +
                licenseNum);
        System.out.println("Current speed is "+speed+" mph");
        System.out.println(dlClass+ " " +isAutomatic);






    }



}
