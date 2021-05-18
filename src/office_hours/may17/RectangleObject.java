package office_hours.may17;

public class RectangleObject {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        System.out.println("rectangle.getArea() = " + rectangle.getArea());

        rectangle.setDimensions(15,5);

        System.out.println("rectangle.getArea() = " + rectangle.getArea());

        Rectangle rectangle2 = new Rectangle();

        System.out.println(rectangle2.getArea());

        System.out.println(rectangle);




    }
}
