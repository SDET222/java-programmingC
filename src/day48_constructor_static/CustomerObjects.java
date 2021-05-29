package day48_constructor_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {


        Customer cs1 = new Customer();

        System.out.println(cs1.toString());

        cs1.setId("A22");
        cs1.setName("John");
        System.out.println("============================");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", "A33"); // create object and assign values in same statement

        System.out.println(cs2);

        Customer cs3 = new Customer("Murodil", "A789");

        System.out.println(cs3);

        Customer [] customerArr = new Customer[4];

        customerArr [0] = cs1;
        customerArr [1] = cs2;
        customerArr [2] = cs3;
        customerArr [3] = new Customer("Trump", "T001");

        System.out.println("==============================");

        System.out.println("customerArr = " + Arrays.toString(customerArr));

        List<Customer> customerList = new ArrayList<>();

        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Trump", "T001"));
        customerList.add(new Customer("Jlo", "J994"));


        System.out.println("==========================");
        System.out.println("customerList = " + customerList);


    }
}
