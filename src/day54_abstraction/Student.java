package day54_abstraction;

public abstract class Student {
    public void code(String language){
        System.out.println("Student is coding using "+ language);
    }

    public Student() {
        System.out.println("I'm constructor from parent Student");
    }

    public abstract void attendClass();

}
