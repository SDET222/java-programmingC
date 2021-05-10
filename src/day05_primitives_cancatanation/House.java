package day05_primitives_cancatanation;

public class House {
    public static void main (String [] args) {
        /*Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms,
        number of kitchens, is there a basement?,
        is there an attic, is there a pool, is the house for sale?, cost of the house,
        address, zipcode, is a park near by,
        Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3 */
        String houseType = "Townhouse";
          byte numBed = 3;
          byte numBath= 2;
          byte numKit = 1;
          boolean isBasement = true;
          boolean isAttic = true;
          boolean isPool = false;
          boolean isForSale = false;
          double costOfH= 1514.55;
          String address= "123 Baker Str, Miami, Fl";
          int zip = 35025;
          boolean isPark = true;
          byte schoolRating = 5;
        System.out.println("The number of bedrooms is: \t"+numBed);
        System.out.println("The number of bathrooms is: "+numBath);
        System.out.println("The number of kitchens is:  "+numKit);
        System.out.println("Is there a basement ?:      "+isBasement);
        System.out.println("Is there an attic? :        "+isAttic);
        System.out.println("Is there a pool? :          "+isPool);
        System.out.println("Is the house for sale? :    "+isForSale);
        System.out.println("Cost of the house :        $"+costOfH);
        System.out.println("Address :                   "+address);
        System.out.println("ZIP CODE :                  "+zip);
        System.out.println("Is there a park near by ? : "+isPark);
        System.out.println("Rating of surrounding school districts is : "+schoolRating);







    }




}
