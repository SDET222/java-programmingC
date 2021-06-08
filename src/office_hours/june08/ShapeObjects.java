package office_hours.june08;

public class ShapeObjects {
    public static void main(String[] args) {


        Shape shape1 = new Shape();

        shape1.calculateArea();

        Square square1 = new Square();
        square1.side = 5;
        square1.calculateArea();
        System.out.println("square1.area = " + square1.area);

        System.out.println(square1);

        square1.calculatePerimeter();

        System.out.println("square1.perimeter = " + square1.perimeter);

        System.out.println(square1);

        Rectangle rec = new Rectangle();

        rec.length = 5;
        rec.width = 3;

        rec.calculateArea();
        rec.calculatePerimeter();

        System.out.println(rec);

        Circle circle = new Circle();

        circle.radius = 12;
        circle.diameter = 4;

        circle.calculateArea();
        circle.calculatePerimeter();

        System.out.println(circle);






    }




}
