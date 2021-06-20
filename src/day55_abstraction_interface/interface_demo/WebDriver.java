package day55_abstraction_interface.interface_demo;

public interface WebDriver {

    public abstract void get(String url);
    void findElement(String locator);
    void quit(); // automatically ==> public abstract
    String getTitle();






}
