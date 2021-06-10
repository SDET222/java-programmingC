package repl_it.oop;

public class Person {


    private String firstName;
    private String lastName;
    private int age;


    public Person() {
        setAge(-1);
        setFirstName("undefined");
        setLastName("undefined");

    }

    public Person(String firstName, String lastName, int age) {

        setAge(age);
        setFirstName(firstName);
        setLastName(lastName);

    }


    @Override
    public String toString() {
        return firstName + " | " + lastName + " | "  + age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
