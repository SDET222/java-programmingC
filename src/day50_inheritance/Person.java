package day50_inheritance;
/**
 * super class
  */
public class Person {

    String name;
    int age;

    public Person() {

    }

    public void walk() {
        System.out.println(name+ " is walking");
    }
    public void talk() {
        System.out.println(name+ " is talking");
    }
    public void work(String job) {
        System.out.println(name+ " is working as " + job);
    }
}
