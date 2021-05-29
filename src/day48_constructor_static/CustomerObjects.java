package day48_constructor_static;

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



    }
}
