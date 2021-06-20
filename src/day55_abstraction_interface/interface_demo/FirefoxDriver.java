package day55_abstraction_interface.interface_demo;

public class FirefoxDriver implements WebDriver{


    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver navigating to "+url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver - locating element by " + locator);
    }

    @Override
    public void quit() {
        System.out.println("FirefoxDriver quit session");
    }

    @Override
    public String getTitle() {
        return "FOX";
    }
}
