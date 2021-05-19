package day46_encapsulation;

public class Car {

    private String make;
    private int year;
    private int mileage;

    public void setMake(String make) {
        this.make = make;

    }

    public String getMake() {
        return make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

   @Override
   public String toString() {
      return "Car{" +
              "make='" + make + '\'' +
              ", year=" + year +
              ", mileage=" + mileage +
              '}';
   }
}
