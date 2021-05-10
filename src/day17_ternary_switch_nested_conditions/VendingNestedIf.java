package day17_ternary_switch_nested_conditions;
public class VendingNestedIf {
    public static void main (String [] args)  {


        String selection = "snack";
        String drinkItem = "tea";
        String snackItem = "chips";

        if (selection.equals("drink")) {
            System.out.println("Drink option selected");
            if(drinkItem.equals("tea")){
                System.out.println("Tea is selected");
                if(drinkItem.equals("coke")){
                    System.out.println("Coke is selected");
                }
            }
        } else if (selection.equals("snack")) {
                System.out.println("Snack option is selected");
            } if (selection.equals("chips")){
                System.out.println("chips item selected");
            } if (selection.equals("candy")) {
                System.out.println("Candy item selected");
            }



    }
}
