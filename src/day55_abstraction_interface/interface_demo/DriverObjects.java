package day55_abstraction_interface.interface_demo;

public class DriverObjects {



    public static void main(String[] args) {
        //can not create an object of interface

        ChromeDriver driver1 = new ChromeDriver();
        FirefoxDriver driver2 = new FirefoxDriver();
        WebDriver driver3 = new ChromeDriver();

        driver1.get("//https:www.google.com");
        driver1.findElement("//input[@name='q'");
        System.out.println("driver1.getTitle() = " + driver1.getTitle());


    }
}
