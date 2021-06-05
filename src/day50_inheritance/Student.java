package day50_inheritance;

public class Student extends Person{

    public void  learn(String field){
        System.out.println(name + " learns "+field);

        System.out.println("This student is hard working and talented");
    }
}
