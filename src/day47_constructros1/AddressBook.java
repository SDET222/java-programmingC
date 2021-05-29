package day47_constructros1;

public class AddressBook {
    public static void main(String[] args) {

        Address adr1 = new Address();

        adr1.setStreet("69 Woodland Road");
        adr1.setCity("New Providence");
        adr1.setState("NJ");
        adr1.setZipCode("07974");

        System.out.println(adr1);

        System.out.println(adr1.getStreet());

        Address adr2 = new Address();

        System.out.println(adr2.toString());

        Address adr3 = new Address();

        System.out.println("this is adr3 " + adr3);

        Address mc = new Address("5255 South Street Manhattan");

        System.out.println("mc = "+mc);


    }
}
