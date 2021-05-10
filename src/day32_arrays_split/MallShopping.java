package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {


        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};


        System.out.println("=====Find the index of 'Gloves' in items array=====");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Gloves")) {
                System.out.println("Gloves found at index: " + i);
                break;
            }
        }

        System.out.println("\n===Set boolean to true if first iPad is found===");

        boolean iPadExist = false;

        for (String each : items) {
            if (each.equalsIgnoreCase("iPad")) {
                iPadExist = true;
                break;
            }
        }
        System.out.println("iPadExist = " + iPadExist);

        System.out.println("\nPrint a report of each shopping item");


        for (int i = 0; i < items.length; i++) {

            System.out.print(items[i] + " - " + "$" + prices[i] + " -Item ID #"
                    + itemIDs[i] + " // ");
        }

        System.out.println("\n====Look for 'Jacket' in items and print all details====");


        for (int i = 0; i < items.length; i++) {

            if(items[i].equalsIgnoreCase("Jacket")) {

                System.out.println(items[i]+" - $"+prices[i]+" / Item#"+itemIDs[i]);
                break;
            }
        }



    }
}
