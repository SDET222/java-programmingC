package day48_constructor_static;

public class Customer {

    private String name;
    private String id;

    //No args constructor

    public Customer() {

        System.out.println("No args constructor // no return");

        name = "new customer";
        id = "A11";

    }

    public Customer(String name, String id) {

        System.out.println("Two args constructor");

        setName(name);
        setId(id);
         //this.name = name;
        //this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
