package day57_abstraction_polymorphism.abstract_clas_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB {

    @Override
    public void abstrMethodA() {
        System.out.println("abstrMethodA implementation");
    }

    @Override
    public void normalMethodB(){
        System.out.println("normalMethodB overridden version");
    }

    public static void  staticMethodC(){
        System.out.println("StaticMethodC can not be overridden it is HIDDEN!");
    }

    @Override
    public void abstrMethodD(int num) {
        System.out.println("abstrMethodD overridden version is called "+num);
    }
}
