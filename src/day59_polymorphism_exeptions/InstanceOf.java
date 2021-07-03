package day59_polymorphism_exeptions;

import day57_abstraction_polymorphism.polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.polymorphism.shapes.Shape;
import day57_abstraction_polymorphism.polymorphism.shapes.Square;

public class InstanceOf {
    public static void main(String[] args) {
        //instance of operator
        Shape shape = new Circle();

        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);

        Shape sh = new Square();

        System.out.println("sh.getClass() = " + sh.getClass().getSimpleName()); //java reflection api

        if(sh instanceof Circle) {
            System.out.println("It is a Circle object");
        } else if (sh instanceof Square) {
            System.out.println("It is a Square object");
        } else {
            System.out.println("Invalid object");
        }

        System.out.println(sh.getClass().getDeclaredMethods().length);

        WebElement el = new Link();
        System.out.println("object class name of el variable = " + el.getClass().getSimpleName());
        //System.out.println(el.getClass().getDeclaredFields());



    }
}
