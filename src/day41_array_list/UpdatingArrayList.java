package day41_array_list;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {

        List<String> myCars = new ArrayList<>();

        myCars.add("Toyota");
        myCars.add("Ferrari");
        myCars.add("Porsche");
        myCars.add("Vaz");
        myCars.add("BMW");
        myCars.add(0, "Tesla");
        myCars.add(1, "Jeep");

        System.out.println(myCars.toString());

        String allCarsInOneString = myCars.toString();
        System.out.println("allCarsInOneString = " + allCarsInOneString);
        System.out.println(allCarsInOneString.charAt(0));

        myCars.set(1, "Lambo");
        System.out.println(myCars);

        myCars.set(5, "Bentley");
        System.out.println(myCars);


        System.out.println("Index of 'Lambo' is -> " + myCars.indexOf("Lambo"));

        myCars.set(myCars.indexOf("Tesla"), "Traban");
        System.out.println(myCars);

        if (myCars.contains("Traban")) {
            myCars.set(myCars.indexOf("Traban"), "LandRover");
        } else {
            System.out.println("Traban is not found");
        }

        System.out.println("after set LandRover = "+myCars);




        for (int i = 0; i < myCars.size(); i++) {

            if(myCars.get(i).equals("Lambo")) {
                myCars.set(i, "Prius");

            }
            if(myCars.get(i).equals("Toyota")){
                myCars.set(i,"Audi");


            }


        }
        System.out.println(myCars);


    }
}
