package day55_abstraction_interface.interface_demo;

public interface MyInterface {
    public abstract void learn(); //by default

}

interface MyInterface2 {

}

class MyClass implements MyInterface, MyInterface2 {
    @Override
    public void learn() {
        System.out.println("Learning in MyClass");
    }

}


class Main {
    public static void main(String[] args) {
        //MyInterface myInterface = new MyInterface(); can not be instantiated
        MyClass myClass = new MyClass();

    }


}