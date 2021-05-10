package test_it_now;

public class ArmySaim {
    public static void main(String[] args) {

        String citizenship = "USA"; // next()
        boolean resident = true; // nextBoolean()

        if(citizenship.equalsIgnoreCase("USA") || resident) {
            int age = 48; // nextInt()
            if(age >= 18 && age <= 35) {
                boolean hasDiploma = true; // nextBoolean()
                if(hasDiploma) {
                    System.out.println("You are qualified for the US Army");
                } else {
                    System.out.println("You must have a high school diploma");
                }

            } else {
                System.out.println("Your age must be between 18 to 35 years old");
            }

        } else {
            System.out.println("You must be a U.S. citizen or a resident");
        }



    }
}
