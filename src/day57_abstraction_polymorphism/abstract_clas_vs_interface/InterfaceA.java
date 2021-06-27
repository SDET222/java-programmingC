package day57_abstraction_polymorphism.abstract_clas_vs_interface;

public interface InterfaceA { // interface can extend only Interface

//    public InterfaceA() {      interface can not have constructor
//
//    }

    public static final String TYPE = "interface type";
    double MAX_COUNT  = 222.2; //automatically --> public static final


    public abstract void abstrMethodD(int num);

    //starting from java 8 (jdk 1.8)
    public static void staticMethodE(String str) {
        System.out.println("staticMethodE is called with str - "+str);
    }

    public default void defaultMethodF() {
        System.out.println("defaultMethodF is called...");
    }

}
