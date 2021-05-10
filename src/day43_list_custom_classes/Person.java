package day43_list_custom_classes;

public class Person {

    String firstName ;
    int age ;
    char gender;
    public void speak() {
        System.out.println("Person is speaking");
    }
}

class People {
    public static void main(String[] args) {

      Person person1 = new Person();
      person1.firstName= "Joe";
      person1.age= 36;
      person1.gender ='M';


        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);
        person1.speak();

        Person person2 = new Person();

        person2.firstName = "Orkhan";
        person2.age = 40;
        person2.gender = 'M';

        System.out.println("person2.firstName = " + person2.firstName);
        System.out.println("person2 age = " + person2.age);
        System.out.println("person2 gender = " + person2.gender);
        person2.speak();





    }
}