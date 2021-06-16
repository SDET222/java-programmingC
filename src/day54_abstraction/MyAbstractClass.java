package day54_abstraction;

public abstract class MyAbstractClass {

    int num = 2;

    public void learn() {
        System.out.println("Learning");
    }

    public abstract void close();


}

class Sub extends MyAbstractClass {

    // sub classes also called CONCRETE Class overrides/implements abstract method

    public void close(){
        System.out.println("Close abstract method implementation");
    }


}

class MyObjects {

    public static void main(String[] args) {

        //MyAbstractClass mac = new MyAbstractClass();

        Sub sub = new Sub();
        sub.learn();
        System.out.println("sub.num = " + sub.num);
        sub.close();



    }
}