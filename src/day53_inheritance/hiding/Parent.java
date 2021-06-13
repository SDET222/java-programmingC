package day53_inheritance.hiding;

public class Parent {

    public String name = "parent > D.Trump";

    public void introduce1() {
        System.out.println("Hello, I'm " + name);
    }

}

class Child extends Parent{

    public String name = "child > J.Biden";

    public void introduce2() {
        System.out.println("Hello, I'm " + name);
    }

}

class Runner {
    public static void main(String[] args) {

        Parent p = new Parent();

        p.introduce1();

        Child c = new Child();

        c.introduce1();
        c.introduce2();







    }
}
