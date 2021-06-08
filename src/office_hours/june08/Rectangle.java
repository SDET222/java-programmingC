package office_hours.june08;

public class Rectangle extends Shape {

    double length;
    double width;

    @Override
    public void calculateArea() {

        area = length * width;

    }

    @Override
    public void calculatePerimeter() {

        perimeter = (length + width) * 2;

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }


}
