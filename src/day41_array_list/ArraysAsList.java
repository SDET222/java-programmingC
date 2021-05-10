package day41_array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 4, 5, 3);

        //nums.add(100); can not change size by add or remove
        System.out.println(nums);

        //int [] arr = {15,14,13,12,11};

        ArrayList<Double> nums2 = new ArrayList<>(Arrays.asList(23.3, 14.1, 2.9));

        nums2.add(99.9);
        nums2.add(11.7);

        System.out.println(nums2);

        nums2.remove(new Double(23.3));

        System.out.println(nums2);

        ArrayList<String> drinksWithCoffeine = new ArrayList<>(Arrays.asList("coffee",
                "tea", "RedBull", "Coke", "Monster", "Kambucha", "celcius", "Pepsi"));


        int coffeinAmmount = 0;
        for (String each : drinksWithCoffeine) {
            if (each.equals("Monster") || each.equals("RedBull") || each.equals("celcius") ||
                    each.equals("Kambucha") || each.equals("coffee")) {
                coffeinAmmount = 150;
            } else if (each.equals("Coke") || each.equals("Pepsi") || each.equals("tea")) {
                coffeinAmmount = 112;
            } else {
                System.out.println("Invalid item");
            }

            System.out.println(each + " --> " + coffeinAmmount + " mg coffeine");


            System.out.println("=================================");


        }

        for (String drink : drinksWithCoffeine) {

            switch (drink) {

                case "RedBull":
                case "coffee":
                case "Monster":
                case "Kambucha":
                    coffeinAmmount = 150;
                    System.out.println(drink + " --> " + coffeinAmmount + " mg coffeine");
                break;

                case "tea": case "Coke": case "Pepsi":
                    coffeinAmmount = 111;
                    System.out.println(drink + " --> " + coffeinAmmount + " mg coffeine");
                    break;
            }


        }

        drinksWithCoffeine.forEach(drink -> System.out.println(drink));

        drinksWithCoffeine.forEach(drink -> {
            System.out.println("this is for each block");
            System.out.println("drink = " + drink);
            if (drink.equals("Coke")) {
                System.out.println("Coke is here");
            }
        });



    }
}
