package day57_abstraction_polymorphism.polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {

        Shape shape1 = new Triangle();
        Shape shape2 = new Circle();
        Shape shape3 = new Square();
        Shape emoji = new Emoji();

        shape1.draw();
        shape2.draw();
        shape3.draw();
        emoji.draw();
        System.out.println("===================");

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(shape1);
        shapeList.add(shape2);
        shapeList.add(shape3);
        shapeList.add(emoji);


        for(Shape each:shapeList) {
            System.out.println("I'm drawing ...");
           each.draw();
        }

        drawShape(new Circle());
        drawShape(new Square());
        drawShape(shape1);

    }

    public static void drawShape(Shape shape) {
        System.out.println("Draw from static method");
        shape.draw();
    }
}
