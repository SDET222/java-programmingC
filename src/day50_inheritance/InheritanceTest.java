package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {


        Person p1 = new Person();

        p1.name = "Mary";
        p1.age = 29;
        p1.talk();
        p1.walk();
        p1.work("Math teacher");
        System.out.println(p1.name);


        System.out.println("===================================");

        Teacher t1 = new Teacher();

        t1.teacherId = 1234;

        t1.name = "Ron";

        t1.age = 22;

        t1.teach("Chemistry");

        t1.talk();

        System.out.println(t1.name);

        Student s = new Student();
        s.name = "Ali";
        s.age = 23;
        s.work("Developer");

        System.out.println("s.age = " + s.age);

        s.learn("QA");

        s.talk();
        s.walk();

    }
}
