package day16_switch_ternary;

public class AppartmentSelection {
    public static void main(String[] args) {

        int numOfBedrooms = 5;
        double startingPrice = 0;
        String result = "";
        System.out.println("*****Welcome To ADAIRE Apartments*****");

        switch (numOfBedrooms) {

            case 0:
                startingPrice = 1454;
                result = "Studio apartment selected";
                break;
            case 1:
                startingPrice = 1725;
                result = "One bedroom selected";
                break;
            case 2:
                startingPrice = 2899;
                result = "Two bedroom selected";
                break;

            default:
                result = numOfBedrooms+" bedroom apartment currently unavailable";

             //return;    Exit MAIN method
        }

        System.out.println(result);
        System.out.println("Starting price: $" + startingPrice);


    }


}
