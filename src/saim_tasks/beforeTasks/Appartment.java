package saim_tasks.beforeTasks;

public class Appartment {
    public static void main (String [] args) {
        /*Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit,
         monthly rent amount, number of washers and driers, allows pets or not, has a pool,
          length of lease, total number of residents in building, phone number of owner,
           is near a gas station, number of floors, has a basement,
           has available units for rent, has air conditioning, number of parking spaces,
           has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)
         */

        String address = "100 Palm Beach, Miami, FL";
        String nameOfOwner = "Warren Buffet";
        int numberOfUnits = 85;
        double unitSize = 2540.5;
        double monthlyRent = 3500;
        int washersDryers = 214;
        boolean isPetsOk = true;
        boolean hasPool = true;
        int lengthOfLease = 12;
        int residentsInB = 216;
        long phoneNumberOwner = 9179411010l;
        boolean isGasNear = true;
        byte numFloors = 17;
        boolean hasBasement = false;
        boolean unitsForRent = true;
        boolean hasAc = true;
        int parkingSpaces = 300;
        boolean wheelchairAccess = true;
        float reviewS = 4.8f;
        double rentAfter3 = monthlyRent -(monthlyRent*0.1);
        double rentAfter6 = monthlyRent -(monthlyRent*0.2);
        int residentsPerUnit = residentsInB / numberOfUnits;
        double parkingPerUnit =  parkingSpaces / residentsInB ;
        double unitsPerFloor = numberOfUnits / numFloors;

        System.out.println("Address:              " + address);
        System.out.println("Owner:                " + nameOfOwner);
        System.out.println("Number of units:      " + numberOfUnits);
        System.out.println("Average size of unit: "+unitSize);
        System.out.println("Monthly rent amount: $" + monthlyRent);
        System.out.println("Number of washers and dryers: "+washersDryers);
        System.out.println("Is pets allowed?:     " + isPetsOk);
        System.out.println("Pool Available?:      " + hasPool);
        System.out.println("Length of lease:      "+lengthOfLease+" month");
        System.out.println("Total number of residents in building: "+residentsInB);
        System.out.println("Owner's phone number: " + phoneNumberOwner);
        System.out.println("Gas station nearby?:  "+ isGasNear);
        System.out.println("Number of floors:     "+numFloors);
        System.out.println("Has a basement?       "+hasBasement);
        System.out.println("Has avialiable units for rent?: "+unitsForRent);
        System.out.println("Has air conditioning? "+hasAc);
        System.out.println("Number of parking spaces: " + parkingSpaces);
        System.out.println("Has wheelchair access?:   "+ wheelchairAccess);
        System.out.println("Rating :              " + reviewS);
        System.out.println("*****************************************************");
        System.out.println("Monthly rent ammount after 3 years:  $"+rentAfter3);
        System.out.println("Monthly rent after 6 years:          $"+rentAfter6);
        System.out.println("Average number of residents per unit: "+residentsPerUnit);
        System.out.println("Average number of parking spots per unit: "+parkingPerUnit);
        System.out.println("Average number of units per floor:    "+unitsPerFloor);














    }




}
