package day40_arrayList;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("is empty? = " + shoppingList.isEmpty());

        if(shoppingList.isEmpty()) {
            System.out.println("Add items...keep coding java");
        } else {
            System.out.println("list is full. code java then go to mall");
        }

        shoppingList.add("sneakers"); shoppingList.add("t-shirt"); shoppingList.add("iphone");
        shoppingList.add("sunglasses"); shoppingList.add("Ferrari"); shoppingList.add("smartWatches");

        if(shoppingList.isEmpty()) {
            System.out.println("Add items...keep coding java");
        } else {
            System.out.println("list is full. code java then go to mall");
        }

        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);

        System.out.println("Is sneakers in my list? = " + shoppingList.contains("sneakers"));

        if(shoppingList.contains("sneakers")){
            System.out.println("sneakers are in my list");
        } else {
            System.out.println("add sneakers to shoppingList");
        }

        System.out.println("buying sneakers....$99.99");
        shoppingList.remove(("sneakers"));
        System.out.println(shoppingList);
        System.out.println("Finished shopping");
        shoppingList.clear();
        System.out.println(shoppingList);

    }

}
