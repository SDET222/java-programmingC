package office_hours.may17;

public class Rectangle {

    double height , width , area;


    public void setDimensions(double recHeight,double recWidth ) {

        height=recHeight;
        width=recWidth;
        area = height * width;

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height= " + height +
                ", width= " + width +
                ", area= " + area +
                '}';
    }

    public double getArea() {
        area = height * width;
        return area;


    }



}
