package day18_conditions_practice_strings_intro;

public class CarLeasing {
    public static void main(String[] args) {

        String make = "Toyota"; // Audi
        String model = "QS";      // A , / SQ5
      double leasePrice = 0.0;   // 500 , / 400   / 552 / 412


//        if (make.equals("Mercedes") && model.equals("E")) {
//            leasePrice= 500;
//        } else if (make.equals("Mercedes") && model.equals("A")) {
//            leasePrice=400.0;
//        }

        if (make.equals("Mercedes")){

            if (model.equals("E")){
                leasePrice=500.0;
            } else if (model.equals("A")){
                leasePrice=400.0;
            }
        } if (make.equals("Audi")) {
            if (model.equals("A")){
                leasePrice=442;
            } else if (model.equals("QS")) {
                leasePrice=482;
            }
        }else {
            System.out.println("Invalid make");
        }

        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);






    }
}
