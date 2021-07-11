package day61_exceptions_collections;

public class ElementaryStudentTest {
    public static void main(String[] args) {
try {

    ElementaryStudent el = new ElementaryStudent();
    el.setName("Joe");
    el.setAge(1);
    System.out.println(el);
} catch (Exception e) {
    e.printStackTrace();
}
        System.out.println("----execution completed----");

    try{
        throw new IllegalArgumentException("Error");
    } catch(Exception e){
        System.out.println("Exception caught");
    }
        System.out.println("----executing the rest code----");






    }
}
