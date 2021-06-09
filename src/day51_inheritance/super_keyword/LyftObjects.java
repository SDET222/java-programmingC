package day51_inheritance.super_keyword;

public class LyftObjects {

    public static void main(String[] args) {

        Lyft reg = new Lyft();
        System.out.println("reg.calculateRate(4.5) = " + Math.round(reg.calculateRate(4.5)));
        System.out.println(Math.round(reg.calculateRate(4.7)));

        double regRidePrice = Math.round(reg.calculateRate(4.7));

        System.out.println("regRidePrice = " + regRidePrice);

        LyftXl xlRide = new LyftXl();

        double xlRidePrice = xlRide.calculateRate(4.7);
        System.out.println("xlRidePrice = " + xlRidePrice);

        Lux luxRide = new Lux();

        double luxRidePrice = luxRide.calculateRate(4.7);

        System.out.println("luxRidePrice = " + luxRidePrice);

        /**
         *         Access modifiers
         *         private/default/protected/public
         *         subclass version should be same or more visible
         */

    }
}
