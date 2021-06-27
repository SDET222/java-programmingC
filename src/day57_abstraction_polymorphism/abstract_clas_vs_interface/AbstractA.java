package day57_abstraction_polymorphism.abstract_clas_vs_interface;

public abstract class AbstractA {

    public AbstractA(){
        System.out.println("Constructor from AbstractA...");
    }

    int num1;
    private double price;
    public static int count;
    public final String TYPE = "abstract type";
    public static final String LANGUAGE = "java";

    public abstract void abstrMethodA(); // can not be private or final or static !
    public void normalMethodB(){
        System.out.println("Method B is non-abstract...called now");
    }

        public static void  staticMethodC(){
        System.out.println("Static methodC is called");
    }



}
